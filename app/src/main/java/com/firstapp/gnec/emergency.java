package com.firstapp.gnec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class emergency extends AppCompatActivity {
    private static final int CALL_PERMISSION_REQUEST_CODE = 1;
    private Button btnCall;
    private Button taCall;
    private Button returnbtn;

    DatabaseReference reference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://apptest-f7922-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        btnCall = findViewById(R.id.btnCall);
        taCall = findViewById(R.id.taCall);
        returnbtn =findViewById(R.id.returnButton);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ActivityCompat.checkSelfPermission(emergency.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(emergency.this, new String[]{Manifest.permission.CALL_PHONE}, CALL_PERMISSION_REQUEST_CODE);
                } else {
                    makeCall();
                }
            }
        });

        taCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maketaCall();
            }
        });

        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(emergency.this, Child_Home.class));

            }
        });
    }

    private void makeCall() {
        String currentUserId = getCurrentUserId();
        if (currentUserId != null) {
            reference.child("User").child(currentUserId).child("phone").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()) {
                        String phoneNumber = snapshot.getValue(String.class);
                        if (phoneNumber != null && !phoneNumber.isEmpty()) {
                            String phoneNumberUri = "tel:" + phoneNumber;
                            Intent callIntent = new Intent(Intent.ACTION_DIAL);
                            callIntent.setData(Uri.parse(phoneNumberUri));
                            startActivity(callIntent);
                        } else {
                            Toast.makeText(emergency.this, "Phone number not available", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(emergency.this, "Phone number not available", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(emergency.this, "Failed to fetch phone number", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void maketaCall() {
        String currentUserId = getCurrentUserId();
        if (currentUserId != null) {
            reference.child("User").child(currentUserId).child("phone").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()) {
                        String phoneNumber = snapshot.getValue(String.class);
                        if (phoneNumber != null && !phoneNumber.isEmpty()) {
                            String phoneNumberUri = "tel:" + phoneNumber;
                            Intent callIntent = new Intent(Intent.ACTION_DIAL);
                            callIntent.setData(Uri.parse(phoneNumberUri));
                            startActivity(callIntent);
                        } else {
                            Toast.makeText(emergency.this, "Phone number not available", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(emergency.this, "Phone number not available", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(emergency.this, "Failed to fetch phone number", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CALL_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makeCall();
            }
        }
    }

    private String getCurrentUserId() {
        return LoginActivity.currentuser;
    }
}
