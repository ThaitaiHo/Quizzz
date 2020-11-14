package com.example.quizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.firebase.firestore.FirebaseFirestore;

public class Level extends Activity {

    private FirebaseFirestore firestore;


    Button easy, normal, hard, back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);

        Button btneasy, btnnormal, btnhard, btnback;

        btneasy = (Button)findViewById(R.id.easy_btn);
        btnnormal = (Button)findViewById(R.id.normal_btn);
        btnhard = (Button)findViewById(R.id.hard_btn);
        btnback = (Button)findViewById(R.id.back_btn);

        firestore = FirebaseFirestore.getInstance();

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
