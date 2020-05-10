package com.example.easymathlife.ui.gallery;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.easymathlife.R;
import com.example.easymathlife.ui.slideshow.SlideshowFragment;

import java.util.Objects;

public class GalleryFragment extends Fragment {

    private TextView chText1;
    private TextView chText3;
    private TextView chText4;
    private TextView chText5;
    private EditText c1, v1, c2, v2, gdm, mv, mol, im,
            fm, mm2, iv, fv, sg, pp, mm;
    private float ans;
    private String workings;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ViewModelProviders.of(this).get(GalleryViewModel.class);
        return inflater.inflate(R.layout.fragment_gallery, container, false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

        Button sw = view.findViewById(R.id.sw);
        Button c1v1cal = view.findViewById(R.id.c1v1calc);
        Button SCalc = view.findViewById(R.id.solidcalc);
        Button scCalc = view.findViewById(R.id.Scalingcalc);
        Button licalc = view.findViewById(R.id.liquidcalc);
        chText1 = view.findViewById(R.id.c1v1Heading);
        TextView chText2 = view.findViewById(R.id.solidSampleHeading);
        chText3 = view.findViewById(R.id.LiquidReagents);
        chText4 = view.findViewById(R.id.GpL_textView);
        chText5 = view.findViewById(R.id.SolidTitle2);
       TextView chText6 = view.findViewById(R.id.chemWarning1);
        c1 = view.findViewById(R.id.c1);
        v2 = view.findViewById(R.id.v2);
        c2 = view.findViewById(R.id.c2);
        v1 = view.findViewById(R.id.v1);
        gdm = view.findViewById(R.id.gdm);
        mv = view.findViewById(R.id.mv);
        mol = view.findViewById(R.id.molarity);
        im = view.findViewById(R.id.im);
        fm = view.findViewById(R.id.fm);
        mm2 = view.findViewById(R.id.mm2);
        iv = view.findViewById(R.id.iv);
        fv = view.findViewById(R.id.fv);
        sg = view.findViewById(R.id.sg);
        pp = view.findViewById(R.id.pp);
        mm = view.findViewById(R.id.mm);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.getText().clear();
            }
        });

        v1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      v1.getText().clear();
                                  }
                              });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2.getText().clear();
            }
        });

        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2.getText().clear();
            }
        });



        mm.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      mm.getText().clear();
                                  }
                              });

        gdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.getText().clear();
            }
        });

        mm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm2.getText().clear();
            }
        });

        mv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mv.getText().clear();
            }
        });

        mol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mol.getText().clear();
            }
        });

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im.getText().clear();
            }
        });

        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.getText().clear();
            }
        });

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.getText().clear();
            }
        });

        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fv.getText().clear();
            }
        });

        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sg.getText().clear();
            }
        });

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pp.getText().clear();
            }
        });


        sw.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle result = new Bundle();
                    result.putString("bundleKey", "result");


                    SlideshowFragment ssF = new SlideshowFragment();
                    assert getFragmentManager() != null;
                    getFragmentManager().beginTransaction().add(R.id.container, ssF).commit();




                }


            });


           /*
             Bundle result = new Bundle();
                    result.putString("bundleKey", "result");
                    getParentFragmentManager().setFragmentResult("requestKey", result);

           @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
               SlideshowFragment ssF = new SlideshowFragment();


                Bundle args = new Bundle();
                args.putString("abs", "a");
                ssF.setArguments(args);



                try {
                    getActivity().getIntent().putExtra("key", "value");
                } catch (Exception e) {
                    e.printStackTrace();
                }
              //  assert getFragmentManager() != null;
               getFragmentManager().beginTransaction().add(R.id.container, ssF).commit();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, ssF);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();




        }

GameSettingsFragment newGamefragment = new GameSettingsFragment();
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.placeholder, newGamefragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        */


        c1v1cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c2.getText() != null && v1.getText() != null && v2.getText() != null && TextUtils.isEmpty(c1.getText())) {
                    ans = Float.parseFloat(String.valueOf(c2.getText())) * Float.parseFloat(String.valueOf(v1.getText())) / Float.parseFloat(String.valueOf(v2.getText()));
                    c1.setText(String.valueOf(ans));
                    workings = "initial conc. = final conc * initial vol / final vol";
                } else if (c2.getText() != null && c1.getText() != null && v2.getText() != null && TextUtils.isEmpty(v1.getText())) {
                    ans = Float.parseFloat(String.valueOf(c2.getText())) * Float.parseFloat(String.valueOf(v2.getText())) / Float.parseFloat(String.valueOf(c1.getText()));
                    v1.setText(String.valueOf(ans));
                    workings = "initial vol = final conc * final vol / initial conc";
                } else if (v2.getText() != null && c1.getText() != null && v1.getText() != null && TextUtils.isEmpty(c2.getText())) {
                    ans = Float.parseFloat(String.valueOf(c1.getText())) * Float.parseFloat(String.valueOf(v1.getText())) / Float.parseFloat(String.valueOf(v2.getText()));
                    c2.setText(String.valueOf(ans));
                    workings = "final conc = initial conc * initial vol / final vol";
                }else if (c2.getText() != null && c1.getText() != null && v1.getText() != null && TextUtils.isEmpty(v2.getText())) {
                    ans = Float.parseFloat(String.valueOf(c1.getText())) * Float.parseFloat(String.valueOf(v1.getText())) / Float.parseFloat(String.valueOf(c2.getText()));
                    v2.setText(String.valueOf(ans));
                    workings = "final vol = initial conc * initial vol / final conc";
                }else {
                    chText1.setText("Error data");
                    workings = "";
                }
            }

        });

        SCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mm.getText() != null && mol.getText() != null && TextUtils.isEmpty(gdm.getText())) {
                    ans = Float.parseFloat(String.valueOf(mol.getText())) * Float.parseFloat(String.valueOf(mm.getText()));
                    gdm.setText(String.valueOf(ans));
                    workings = "molar conc = Molarity * Molar Mass";
                } else if (gdm.getText() != null && mm.getText() != null && TextUtils.isEmpty(mol.getText())) {
                    ans = Float.parseFloat(String.valueOf(gdm.getText())) / Float.parseFloat(String.valueOf(mm.getText()));
                    mol.setText(String.valueOf(ans));
                    workings = "molarity = molar conc / Molar Mass";
                } else if (gdm.getText() != null && mol.getText() != null && TextUtils.isEmpty(mm.getText())) {
                    ans = Float.parseFloat(String.valueOf(gdm.getText())) / Float.parseFloat(String.valueOf(mol.getText()));
                    mm.setText(String.valueOf(ans));
                    workings = "molar mass = molar conc / Molarity";
                }else {
                    chText4.setText("Error data");
                    workings = "";
                }
            }

        });

        scCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iv.getText() != null && fm.getText() != null && fv.getText() != null && TextUtils.isEmpty(im.getText())) {
                    ans = Float.parseFloat(String.valueOf(fm.getText())) * Float.parseFloat(String.valueOf(iv.getText())) / Float.parseFloat(String.valueOf(fv.getText()));
                    im.setText(String.valueOf(ans));
                    workings = "initial mass = final mass * initial vol / final vol";
                } else if (im.getText() != null && fm.getText() != null && fv.getText() != null && TextUtils.isEmpty(iv.getText())) {
                    ans = Float.parseFloat(String.valueOf(im.getText())) * Float.parseFloat(String.valueOf(fv.getText())) / Float.parseFloat(String.valueOf(fm.getText()));
                    iv.setText(String.valueOf(ans));
                    workings = "initial volume = initial mass * final vol / final mass";
                } else if (im.getText() != null && iv.getText() != null && fv.getText() != null && TextUtils.isEmpty(fm.getText())) {
                    ans = Float.parseFloat(String.valueOf(im.getText())) * Float.parseFloat(String.valueOf(fv.getText())) / Float.parseFloat(String.valueOf(iv.getText()));
                    fm.setText(String.valueOf(ans));
                    workings = "final mass = initial mass * final vol / initial vol";
                }else if (im.getText() != null && iv.getText() != null && fm.getText() != null && TextUtils.isEmpty(fv.getText())) {
                    ans = Float.parseFloat(String.valueOf(iv.getText())) * Float.parseFloat(String.valueOf(fm.getText())) / Float.parseFloat(String.valueOf(im.getText()));
                    fv.setText(String.valueOf(ans));
                    workings = "final vol = initial vol * final mass / initial vol";
                }else {
                    chText5.setText("Error data");
                    workings = "initial mass = final mass * initial vol / final vol";
                }
            }

        });


        licalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mm2.getText() != null && sg.getText() != null && pp.getText() != null && TextUtils.isEmpty(mv.getText())) {
                    ans = (Float.parseFloat(String.valueOf(mm2.getText())) * 100) / (Float.parseFloat(String.valueOf(sg.getText())) * Float.parseFloat(String.valueOf(pp.getText())));
                    mv.setText(String.valueOf(ans));
                    workings = "Molar Volume = (Molar Mass * 100) / (specific gravity * % purity)";
                } else if (mv.getText() != null && sg.getText() != null && pp.getText() != null && TextUtils.isEmpty(mm2.getText())) {
                    ans = (Float.parseFloat(String.valueOf(mv.getText())) * Float.parseFloat(String.valueOf(sg.getText())) * Float.parseFloat(String.valueOf(pp.getText()))) / 100;
                    mm2.setText(String.valueOf(ans));
                    workings = "Molar mass = (Molar volume * specific gravity) / (% purity * 100)";
                } else if (mv.getText() != null && mm2.getText() != null && pp.getText() != null && TextUtils.isEmpty(sg.getText())) {
                    ans = (Float.parseFloat(String.valueOf(mm2.getText())) * 100) / (Float.parseFloat(String.valueOf(mv.getText())) * Float.parseFloat(String.valueOf(pp.getText())));
                    sg.setText(String.valueOf(ans));
                    workings = "specific gravity = (Molar Mass * 100) / (specific gravity * % purity)";
                }else if (mv.getText() != null && mm2.getText() != null && sg.getText() != null && TextUtils.isEmpty(pp.getText())) {
                    ans = (Float.parseFloat(String.valueOf(mm2.getText())) * 100) / (Float.parseFloat(String.valueOf(mv.getText())) * Float.parseFloat(String.valueOf(sg.getText())));
                    pp.setText(String.valueOf(ans));
                    workings = "% purity = (Molar Mass * 100) / (specific gravity * molar vol)";
                }else {
                    chText3.setText(R.string.error_msg);
                    workings = "";
                }
            }

        });

    }
}
