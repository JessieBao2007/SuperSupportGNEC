package com.firstapp.gnec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.firstapp.gnec.Game_Home;

public class level1 extends AppCompatActivity {

    Button showprivate, backbtn;
    ImageButton buttbutton, chestbutton,hairbutton, handbutton, legsbutton, mouthbutton,runbutton,sitbutton,walkbutton;
    ImageButton consent1button, consent2button, consent3button, notconsent1button, notconsent2button, notconsent3button;
    ImageButton friendbtn, notfriendbtn, lovebtn, notlovebtn;
    TextView butttext, chesttext, hairtext, handtext, legstext, mouthtext,privatetext,runtext,sittext,walktext,jimmytext;
    TextView consent1text, consent2text, consent3text, notconsent1text, notconsent2text, notconsent3text, consenttext;
    TextView friendtext, notfriendtext, lovetext, notlovetext, boundariestext;
    ConstraintLayout privatesection,jimmylayout, consentsection, boundariessection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);


        //Sections
        privatesection=findViewById(R.id.privatesection);
        jimmylayout=findViewById(R.id.jimmylayout);
        consentsection=findViewById(R.id.consentsection);
        boundariessection=findViewById(R.id.boundariessection);


        //Buttons
        showprivate=findViewById(R.id.continuebtn);
        backbtn=findViewById(R.id.backbtn);
        buttbutton=findViewById(R.id.buttbtn);
        chestbutton=findViewById(R.id.chestbtn);
        hairbutton=findViewById(R.id.hairbtn);
        handbutton=findViewById(R.id.handbtn);
        legsbutton=findViewById(R.id.legbtn);
        mouthbutton=findViewById(R.id.mouthbtn);
        runbutton=findViewById(R.id.runbtn);
        sitbutton=findViewById(R.id.sitsilentlybtn);
        walkbutton=findViewById(R.id.walkawaybtn);
        consent1button=findViewById(R.id.consent1);
        consent2button=findViewById(R.id.consent2);
        consent3button=findViewById(R.id.consent3);
        notconsent1button=findViewById(R.id.notconsent);
        notconsent2button=findViewById(R.id.notconsent2);
        notconsent3button=findViewById(R.id.notconsent3);
        friendbtn=findViewById(R.id.friendbtn);
        notfriendbtn=findViewById(R.id.notfriendbtn);
        lovebtn=findViewById(R.id.lovebtn);
        notlovebtn=findViewById(R.id.notlovebtn);



        //texts(RIGHTS WRONGS)
        butttext=findViewById(R.id.butttext);
        chesttext=findViewById(R.id.chesttext);
        hairtext=findViewById(R.id.hairtext);
        handtext=findViewById(R.id.handtext);
        legstext=findViewById(R.id.legtext);
        mouthtext=findViewById(R.id.mouthtext);
        runtext=findViewById(R.id.runtext);
        sittext=findViewById(R.id.sitsilenttext);
        walktext=findViewById(R.id.walkawaytext);
        consent1text=findViewById(R.id.consent1text);
        consent2text=findViewById(R.id.consent2text);
        consent3text=findViewById(R.id.consent3text);
        notconsent1text=findViewById(R.id.notconsenttext);
        notconsent2text=findViewById(R.id.notconsent2text);
        notconsent3text=findViewById(R.id.notconsent3text);
        friendtext=findViewById(R.id.friendtext);
        notfriendtext=findViewById(R.id.notfriendtext);
        lovetext=findViewById(R.id.lovetext);
        notlovetext=findViewById(R.id.notlovetext);



        //explain text and others
        privatetext=findViewById(R.id.privatetext);
        jimmytext=findViewById(R.id.jimmytext);
        consenttext=findViewById(R.id.consenttext);
        boundariestext=findViewById(R.id.boundariestext);



       /* boolean privatesvisible = butttext.getVisibility() == View.VISIBLE &&
                chesttext.getVisibility() == View.VISIBLE &&
                mouthtext.getVisibility() == View.VISIBLE;*/



        showprivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                privatesection.setVisibility(View.VISIBLE);
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(level1.this, Game_Home.class));
            }
        });

        View.OnClickListener privateVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (butttext.getVisibility() == View.VISIBLE && chesttext.getVisibility() == View.VISIBLE && mouthtext.getVisibility() == View.VISIBLE) {
                    privatetext.setVisibility(View.VISIBLE);
                    jimmylayout.setVisibility(View.VISIBLE);
                } else {
                    privatetext.setVisibility(View.INVISIBLE);
                    jimmylayout.setVisibility(View.INVISIBLE);
                }
            }
        };

        View.OnClickListener jimmyVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (runtext.getVisibility() == View.VISIBLE) {
                    jimmytext.setVisibility(View.VISIBLE);
                    consentsection.setVisibility(View.VISIBLE);
                } else {
                    jimmytext.setVisibility(View.INVISIBLE);
                    consentsection.setVisibility(View.INVISIBLE);
                }
            }
        };


        View.OnClickListener consentVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (consent1text.getVisibility()==View.VISIBLE &&consent2text.getVisibility()==View.VISIBLE&&consent3text.getVisibility()==View.VISIBLE) {
                    consenttext.setVisibility(View.VISIBLE);
                    boundariessection.setVisibility(View.VISIBLE);
                } else {
                    consenttext.setVisibility(View.INVISIBLE);
                    boundariessection.setVisibility(View.INVISIBLE);
                }
            }
        };

        View.OnClickListener boundariesVisibilitychange = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (notfriendtext.getVisibility() == View.VISIBLE && notlovetext.getVisibility() == View.VISIBLE) {
                    boundariestext.setVisibility(View.VISIBLE);
                    backbtn.setVisibility(View.VISIBLE);
                } else {
                    boundariestext.setVisibility(View.INVISIBLE);
                    backbtn.setVisibility(View.INVISIBLE);
                }
            }
        };


        buttbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                butttext.setVisibility(View.VISIBLE);
                privateVisibilitychange.onClick(v);
            }
        });


        //privates
        chestbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chesttext.setVisibility(View.VISIBLE);
                privateVisibilitychange.onClick(v);
            }
        });

        hairbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hairtext.setVisibility(View.VISIBLE);
                privateVisibilitychange.onClick(v);
            }
        });

        legsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                legstext.setVisibility(View.VISIBLE);
                privateVisibilitychange.onClick(v);
            }
        });

        mouthbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mouthtext.setVisibility(View.VISIBLE);
                privateVisibilitychange.onClick(v);
            }
        });

        handbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handtext.setVisibility(View.VISIBLE);
                privateVisibilitychange.onClick(v);
            }
        });


        //jimmy
        runbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runtext.setVisibility(View.VISIBLE);
                jimmyVisibilitychange.onClick(v);
            }
        });

        sitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sittext.setVisibility(View.VISIBLE);
                jimmyVisibilitychange.onClick(v);
            }
        });

        walkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walktext.setVisibility(View.VISIBLE);
                jimmyVisibilitychange.onClick(v);
            }
        });



        //consent
        consent1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consent1text.setVisibility(View.VISIBLE);
                consentVisibilitychange.onClick(v);
            }
        });

        consent2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consent2text.setVisibility(View.VISIBLE);
                consentVisibilitychange.onClick(v);
            }
        });

        consent3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consent3text.setVisibility(View.VISIBLE);
                consentVisibilitychange.onClick(v);
            }
        });


        notconsent1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notconsent1text.setVisibility(View.VISIBLE);
                consentVisibilitychange.onClick(v);
            }
        });

        notconsent2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notconsent2text.setVisibility(View.VISIBLE);
                consentVisibilitychange.onClick(v);
            }
        });

        notconsent3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notconsent3text.setVisibility(View.VISIBLE);
                consentVisibilitychange.onClick(v);
            }
        });


        //boundaries

        friendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friendtext.setVisibility(View.VISIBLE);
                boundariesVisibilitychange.onClick(v);
            }
        });

        notfriendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notfriendtext.setVisibility(View.VISIBLE);
                boundariesVisibilitychange.onClick(v);
            }
        });

        lovebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lovetext.setVisibility(View.VISIBLE);
                boundariesVisibilitychange.onClick(v);
            }
        });


        notlovebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notlovetext.setVisibility(View.VISIBLE);
                boundariesVisibilitychange.onClick(v);
            }
        });



    }
}