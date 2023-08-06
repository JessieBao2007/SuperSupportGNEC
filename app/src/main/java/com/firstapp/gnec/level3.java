package com.firstapp.gnec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;


public class level3 extends AppCompatActivity {
    ImageButton powerbtn, nopowerbtn, power2btn, nopower2btn;
    ImageButton persuadebtn, notpersuadebtn;
    ImageButton uncomf1,uncomf2,uncomf3,uncomf4,uncomf5;
    TextView power1text, nopower1text, power2text, nopower2text;
    TextView persuadetext, notpersuadetext;
    TextView uncomf1text,uncomf2text,uncomf3text,uncomf4text,uncomf5text;
    TextView powertext,persuadetxt,threatentext,spinnertext;
    ConstraintLayout persuadesection,threatensection, spinnersection;
    Button backbtn;
    Spinner sa, pa, sh, neglect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);






        persuadesection=findViewById(R.id.persuadesection);
        threatensection=findViewById(R.id.threatensection);
        spinnersection=findViewById(R.id.spinnersection);


        //button
        powerbtn=findViewById(R.id.powerbtn);
        power2btn=findViewById(R.id.power2btn);
        nopowerbtn=findViewById(R.id.nopowerbtn);
        nopower2btn=findViewById(R.id.nopower2btn);
        persuadebtn=findViewById(R.id.persuadebtn);
        notpersuadebtn=findViewById(R.id.notpersuadebtn);
        uncomf1=findViewById(R.id.uncomf1btn);
        uncomf2=findViewById(R.id.uncomf2btn);
        uncomf3=findViewById(R.id.uncomf3btn);
        uncomf4=findViewById(R.id.uncomf4btn);
        uncomf5=findViewById(R.id.uncomf5btn);
        backbtn=findViewById(R.id.backbtn);



        //text
        power1text=findViewById(R.id.power1text);
        power2text=findViewById(R.id.power2text);
        nopower1text=findViewById(R.id.nopower1text);
        nopower2text=findViewById(R.id.nopower2text);
        persuadetext=findViewById(R.id.persuadetext);
        notpersuadetext=findViewById(R.id.notpersuadetext);
        uncomf1text=findViewById(R.id.uncomf1text);
        uncomf2text=findViewById(R.id.uncomf2text);
        uncomf3text=findViewById(R.id.uncomf3text);
        uncomf4text=findViewById(R.id.uncomf4text);
        uncomf5text=findViewById(R.id.uncomf5text);


        //explain
        powertext=findViewById(R.id.powertxt);
        persuadetxt=findViewById(R.id.persuadetxt);
        threatentext=findViewById(R.id.threatentext);
        spinnertext=findViewById(R.id.spinnertext);


        pa=findViewById(R.id.spinnerpa);
        sa=findViewById(R.id.spinnersa);
        sh=findViewById(R.id.spinnersh);
        neglect=findViewById(R.id.spinnern);






        View.OnClickListener powerVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (power1text.getVisibility() == View.VISIBLE && power2text.getVisibility() == View.VISIBLE) {
                    powertext.setVisibility(View.VISIBLE);
                    persuadesection.setVisibility(View.VISIBLE);
                } else {
                    powertext.setVisibility(View.INVISIBLE);
                    persuadesection.setVisibility(View.INVISIBLE);
                }
            }
        };

        View.OnClickListener persuadeVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (persuadetext.getVisibility() == View.VISIBLE ) {
                    persuadetxt.setVisibility(View.VISIBLE);
                    threatensection.setVisibility(View.VISIBLE);
                } else {
                    persuadetxt.setVisibility(View.INVISIBLE);
                    threatensection.setVisibility(View.INVISIBLE);

                }
            }
        };


        View.OnClickListener threatenVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uncomf1text.getVisibility() == View.VISIBLE && uncomf2text.getVisibility() == View.VISIBLE && uncomf3text.getVisibility() == View.VISIBLE && uncomf4text.getVisibility() == View.VISIBLE &&uncomf5text.getVisibility() == View.VISIBLE) {
                    threatentext.setVisibility(View.VISIBLE);
                    spinnersection.setVisibility(View.VISIBLE);
                } else {
                    threatentext.setVisibility(View.INVISIBLE);
                    spinnersection.setVisibility(View.INVISIBLE);
                }
            }
        };


        powerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                power1text.setVisibility(View.VISIBLE);
                powerVisibilitychange.onClick(v);
            }
        });

        power2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                power2text.setVisibility(View.VISIBLE);
                powerVisibilitychange.onClick(v);
            }
        });

        nopowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nopower1text.setVisibility(View.VISIBLE);
                powerVisibilitychange.onClick(v);
            }
        });


        nopower2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nopower2text.setVisibility(View.VISIBLE);
                powerVisibilitychange.onClick(v);
            }
        });


        persuadebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                persuadetext.setVisibility(View.VISIBLE);
                persuadeVisibilitychange.onClick(v);
            }
        });


        notpersuadebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notpersuadetext.setVisibility(View.VISIBLE);
                persuadeVisibilitychange.onClick(v);
            }
        });


        uncomf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uncomf1text.setVisibility(View.VISIBLE);
                threatenVisibilitychange.onClick(v);
            }
        });

        uncomf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uncomf2text.setVisibility(View.VISIBLE);
                threatenVisibilitychange.onClick(v);
            }
        });

        uncomf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uncomf3text.setVisibility(View.VISIBLE);
                threatenVisibilitychange.onClick(v);
            }
        });

        uncomf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uncomf4text.setVisibility(View.VISIBLE);
                threatenVisibilitychange.onClick(v);
            }
        });

        uncomf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uncomf5text.setVisibility(View.VISIBLE);
                threatenVisibilitychange.onClick(v);
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(level3.this, MainActivity.class));
            }
        });


        sa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateSpinner();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        sh.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateSpinner();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        neglect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateSpinner();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        pa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateSpinner();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }



    private void UpdateSpinner() {
        String selectsa = sa.getSelectedItem().toString();
        String selectpa = pa.getSelectedItem().toString();
        String selectsh=sh.getSelectedItem().toString();
        String selectn= neglect.getSelectedItem().toString();
        if (selectn.equals("Neglect") && selectpa.equals("Physical Assault") && selectsa.equals("Sexual Assault") && selectsh.equals("Sexual Harassment")) {
            spinnertext.setVisibility(View.VISIBLE);
            backbtn.setVisibility(View.VISIBLE);
        }else {
            spinnertext.setVisibility(View.INVISIBLE);
            backbtn.setVisibility(View.INVISIBLE);
        }
    }
}