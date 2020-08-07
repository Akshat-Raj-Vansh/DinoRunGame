package com.arv.dinorun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        logoEntry();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainScreen.class));
                finish();
            }
        }, 4500);
    }

    private void logoEntry() {
        logo = findViewById(R.id.gameName);
        logo.setY(-1000);
        logo.animate().translationYBy(1000).setDuration(2000);
    }
}