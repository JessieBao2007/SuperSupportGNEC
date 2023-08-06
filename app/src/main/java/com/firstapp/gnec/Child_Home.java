package com.firstapp.gnec;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Child_Home extends AppCompatActivity {
    private Button formButton, gameButton,callButton,imagebtn, safespots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_home);

        formButton = (Button) findViewById(R.id.formButton);
        gameButton=findViewById(R.id.Game);
        callButton=findViewById(R.id.EmergencyCall);
        imagebtn=findViewById(R.id.ImageUpload);
        safespots=findViewById(R.id.safeSpotButton);
        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForm();
            }
        });

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Child_Home.this, Game_Home.class));

            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Child_Home.this, emergency.class));

            }
        });

        imagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Child_Home.this, image.class));

            }
        });

        safespots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openSafeSpots();


            }
        });
    }

    public void openForm() {
        Intent intent = new Intent(this, form.class);
        startActivity(intent);
    }

    public void openSafeSpots() {
        Intent intent = new Intent(this, safeSpots.class);
        startActivity(intent);
    }
}