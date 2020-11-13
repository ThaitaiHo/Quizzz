package com.example.quizzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidquizapp.Common.Common;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button btnStart, btnViewscore, btnUsermanual, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.play_btn);
        btnViewscore = findViewById(R.id.viewcode_btn);
        btnUsermanual = findViewById(R.id.manual_btn);
        btnExit = findViewById(R.id.exit_btn);
    }

    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Home.this, LevelGame.class);
            startActivity(intent);
        }

    });


}