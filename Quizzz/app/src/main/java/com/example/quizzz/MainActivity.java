package com.example.quizzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnStart, btnViewscore, btnUsermanual, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
=======

>>>>>>> 645f568aa15d4d8e2344607caf5a24af89e90a43
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.play_btn);
        btnViewscore = findViewById(R.id.viewcode_btn);
        btnUsermanual = findViewById(R.id.manual_btn);
        btnExit = findViewById(R.id.exit_btn);
<<<<<<< HEAD

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QuestionSetup.class);
                startActivity(intent);
            }

        });



    }




=======
        /*
        setContentView(R.layout.high_score);
        // chuyen vo question setup
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, LevelGame.class);
                startActivity(intent);
            }
        });
        */

        //chuyen den trang high_score
        btnViewscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, High_Score.class);
                startActivity(intent);
            }
        });
    }
>>>>>>> 645f568aa15d4d8e2344607caf5a24af89e90a43
}