package com.example.diamondhotels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    static int SPLASH_SCREEN_TIME_OUT=2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,loginClass.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN_TIME_OUT);

    }
}