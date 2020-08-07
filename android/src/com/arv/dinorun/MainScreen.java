package com.arv.dinorun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {
    ImageView start, about;
    TextView start_tv, about_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        start = findViewById(R.id.startnewgame);
        start_tv = findViewById(R.id.start_textview);
    }

    public void startGame(View view) {
        start.setImageResource(R.drawable.buttonpressed);
        start_tv.setTextColor(getResources().getColor(R.color.colorGrey));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                start.setImageResource(R.drawable.buttonunpressed);
                start_tv.setTextColor(getResources().getColor(R.color.colorWhite));
                startActivity(new Intent(MainScreen.this, AndroidLauncher.class));
                finish();
            }
        }, 200);
    }

    public void aboutDisplay(View view) {
    }
}