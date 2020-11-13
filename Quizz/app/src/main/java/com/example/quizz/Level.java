package com.example.quizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Level extends Activity {
    Button easy, normal, hard, back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);

        easy = (Button)findViewById(R.id.easy_btn);
        normal = (Button)findViewById(R.id.normal_btn);
        hard = (Button)findViewById(R.id.hard_btn);
        back = (Button)findViewById(R.id.back_btn);

        //chuyen den trang playing
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, Playing.class);
                startActivity(intent);
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, Playing.class);
                startActivity(intent);
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, Playing.class);
                startActivity(intent);
            }
        });
        //tro ve trang chu
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
