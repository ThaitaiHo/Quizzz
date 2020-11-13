package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button view_score, start, manual, exit;

        start = (Button)findViewById(R.id.play_btn);
        view_score = (Button)findViewById(R.id.viewcode_btn);
        manual = (Button)findViewById(R.id.manual_btn);
        exit = (Button)findViewById(R.id.exit_btn);

        //chuyen den trang level
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Level.class);
                startActivity(intent);
            }
        });
        //chuyen den trang view score
        view_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, High_Score.class);
                startActivity(intent);
            }
        });
        //chuyen den trang manual
        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Manual.class);
                startActivity(intent);
            }
        });
        //exit app
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}