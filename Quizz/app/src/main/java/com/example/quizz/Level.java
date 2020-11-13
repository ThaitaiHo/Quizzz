package com.example.quizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Level extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);

        Button btneasy, btnnormal, btnhard, btnback;

        btneasy = (Button)findViewById(R.id.easy_btn);
        btnnormal = (Button)findViewById(R.id.normal_btn);
        btnhard = (Button)findViewById(R.id.hard_btn);
        btnback = (Button)findViewById(R.id.back_btn);

        btneasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, Easy.class);
                startActivity(intent);
            }
        });

        btnnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, Normal.class);
                startActivity(intent);
            }
        });

        btnhard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, Hard.class);
                startActivity(intent);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
