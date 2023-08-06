package com.firstapp.gnec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Game_Home extends AppCompatActivity {
    Button level1, level2, level3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_home);

        level1=findViewById(R.id.button);
        level2=findViewById(R.id.button2);
        level3=findViewById(R.id.button3);

        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game_Home.this, level1.class));
            }
        });


        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game_Home.this, level2.class));
            }
        });


        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game_Home.this, level3.class));
            }
        });
    }
}