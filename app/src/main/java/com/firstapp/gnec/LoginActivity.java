package com.firstapp.gnec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

public class LoginActivity extends AppCompatActivity {

    TextInputLayout username, password;
    Button loginuser, registeruser;
    //DatabaseReference reference;
    DatabaseReference reference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://apptest-f7922-default-rtdb.firebaseio.com/");
    FirebaseDatabase rootNode;

    FirebaseStorage storage = FirebaseStorage.getInstance();

    public static String currentuser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        FirebaseApp.initializeApp(this);

        username=findViewById(R.id.nameinput);
        password=findViewById(R.id.passwordinput);
        loginuser=findViewById(R.id.login);
        registeruser=findViewById(R.id.register);
        FirebaseApp.initializeApp(this);


        loginuser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                rootNode = FirebaseDatabase.getInstance();
                //reference = rootNode.getReference("User");
                String name = username.getEditText().getText().toString();
                String pass = password.getEditText().getText().toString();



                if(name.isEmpty()||pass.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please fill username or password", Toast.LENGTH_SHORT).show();
                }

                else{
                    reference.child("User").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            if (snapshot.hasChild(name)) {
                                DataSnapshot userSnapshot = snapshot.child(name);
                                Log.d("User", userSnapshot.getValue().toString());
                                String getpass = userSnapshot.child("password").getValue(String.class);
                                if (getpass.equals(pass)) {
                                    Toast.makeText(LoginActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
                                    LoginActivity.currentuser = name;
                                    openHome();
                                    finish();
                                } else {
                                    Toast.makeText(LoginActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(LoginActivity.this, "User not found", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });


        registeruser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegister();
            }
        });

    }
    public void openHome() {
        Intent intent = new Intent(this, Child_Home.class);
        startActivity(intent);
    }

    public void openRegister(){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }



}

