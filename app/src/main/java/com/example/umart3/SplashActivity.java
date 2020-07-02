package com.example.umart3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        firebaseAuth = FirebaseAuth.getInstance();
        SystemClock.sleep(2500);
    }

    /**
     The method below checks if the user is already registered with the app. If already registered
     they are transferred to the Home Activity else transferred to the Register Activity
      **/
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if(currentUser == null)
        {
            Intent homeintent = new Intent(SplashActivity.this, RegisterActivity.class);
            startActivity(homeintent);
            finish();
        }

        else
        {
            Intent homeintent = new Intent(SplashActivity.this, HomeActivity.class);
            startActivity(homeintent);
            finish();

        }
    }
}
