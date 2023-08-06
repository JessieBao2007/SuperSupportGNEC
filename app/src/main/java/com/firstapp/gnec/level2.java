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


public class level2 extends AppCompatActivity {

    ImageButton manipulate, notmanipulate;
    ImageButton emo1,emo2,emo3,notemo1,notemo2;
    TextView manipulatetext, notmanipulatetext;
    TextView emo1text,emo2text,emo3text,notemo1text,notemo2text;
    TextView manipulatetxt,emotext,darvotext;
    ConstraintLayout manipulatesection,emosection, darvosection;
    Spinner d,a,rvo;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        //sections
        manipulatesection=findViewById(R.id.manipulatesection);
        emosection=findViewById(R.id.emosection);
        darvosection=findViewById(R.id.darvosection);

        //imagebtns
        manipulate=findViewById(R.id.manipulatebtn);
        notmanipulate=findViewById(R.id.notmanipulatebtn);
        notemo1=findViewById(R.id.notemo1btn);
        notemo2=findViewById(R.id.notemo2btn);
        emo1=findViewById(R.id.emo1btn);
        emo2=findViewById(R.id.emo2btn);
        emo3=findViewById(R.id.emo3btn);

        //rightwrongs
        manipulatetext=findViewById(R.id.manipulatetext);
        notmanipulatetext=findViewById(R.id.notmanipulatetext);
        emo1text=findViewById(R.id.emo1text);
        emo2text=findViewById(R.id.emo2text);
        emo3text=findViewById(R.id.emo3text);
        notemo1text=findViewById(R.id.notemo1text);
        notemo2text=findViewById(R.id.notemo2text);

        //explains
        manipulatetxt=findViewById(R.id.manipulatetxt);
        emotext=findViewById(R.id.emotext);
        darvotext=findViewById(R.id.darvotext);

        //spinner
        d = findViewById(R.id.spinnerd);
        a = findViewById(R.id.spinnera);
        rvo = findViewById(R.id.spinnerrvo);


        back= findViewById(R.id.backbtn);











        View.OnClickListener manipulateVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (manipulatetext.getVisibility() == View.VISIBLE) {
                    manipulatetxt.setVisibility(View.VISIBLE);
                    emosection.setVisibility(View.VISIBLE);
                } else {
                    manipulatetxt.setVisibility(View.INVISIBLE);
                    emosection.setVisibility(View.INVISIBLE);
                }
            }
        };


        View.OnClickListener emoVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emo1text.getVisibility() == View.VISIBLE && emo2text.getVisibility() == View.VISIBLE && emo3text.getVisibility() == View.VISIBLE) {
                    emotext.setVisibility(View.VISIBLE);
                    darvosection.setVisibility(View.VISIBLE);
                } else {
                    emotext.setVisibility(View.INVISIBLE);
                    darvosection.setVisibility(View.INVISIBLE);
                }
            }
        };


        manipulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manipulatetext.setVisibility(View.VISIBLE);
                manipulateVisibilitychange.onClick(v);
            }
        });

        notmanipulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notmanipulatetext.setVisibility(View.VISIBLE);
                manipulateVisibilitychange.onClick(v);
            }
        });


        emo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emo1text.setVisibility(View.VISIBLE);
                emoVisibilitychange.onClick(v);
            }
        });


        emo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emo2text.setVisibility(View.VISIBLE);
                emoVisibilitychange.onClick(v);
            }
        });



        emo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emo3text.setVisibility(View.VISIBLE);
                emoVisibilitychange.onClick(v);
            }
        });

        notemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notemo1text.setVisibility(View.VISIBLE);
                emoVisibilitychange.onClick(v);
            }
        });


        notemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notemo2text.setVisibility(View.VISIBLE);
                emoVisibilitychange.onClick(v);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(level2.this, MainActivity.class));
            }
        });



        d.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateDarvo();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateDarvo();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        rvo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                UpdateDarvo();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }




    private void UpdateDarvo() {
        String selectd = d.getSelectedItem().toString();
        String selecta = a.getSelectedItem().toString();
        String selectrvo=rvo.getSelectedItem().toString();
        if (selectd.equals("D-Deny") && selecta.equals("A-Attack") && selectrvo.equals("RVO-Reverse Victim and Offender")) {
            darvotext.setVisibility(View.VISIBLE);
            back.setVisibility(View.VISIBLE);
        }else {
            darvotext.setVisibility(View.INVISIBLE);
            back.setVisibility(View.INVISIBLE);
        }
    }

}