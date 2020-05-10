package com.example.easymathlife.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.easymathlife.R;

public class SlideshowFragment extends Fragment {
    public TextView swtv;
    private String work;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelProviders.of(this).get(SlideshowViewModel.class);
        return inflater.inflate(R.layout.fragment_slideshow, container, false);

        //String val = getArguments().getString("");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("key", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String key, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                String result = bundle.getString("bundleKey");
                // Do something with the result...
            }
        });
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        swtv = view.findViewById(R.id.showWorkingsTV);
       try {
           work = getActivity().getIntent().getExtras().getString("key");
       } catch (Exception e) {
           e.printStackTrace();
       }
        swtv.setText(String.valueOf(work));
    }



}
