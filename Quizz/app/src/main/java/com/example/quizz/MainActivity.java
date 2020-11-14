    package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    private TextView appName;
    private FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       appName = findViewById(R.id.appName);

        Typeface typeface = ResourcesCompat.getFont(this,R.font.showg);
        appName.setTypeface(typeface);

        Button view_score, start, manual, exit;

        start = (Button)findViewById(R.id.play_btn);
        view_score = (Button)findViewById(R.id.viewcode_btn);
        manual = (Button)findViewById(R.id.manual_btn);
        exit = (Button)findViewById(R.id.exit_btn);

        firestore = FirebaseFirestore.getInstance();

//        new Thread() {
//            public void run() {
//                // sleep(3000);
//
//                loadData();
//
//
//            }
//        }.start();


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
//    private void loadData()
//    {
//        catList.clear();
//
//        firestore.collection("QUIZ").document("Categories")
//                .get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//
//                if(task.isSuccessful())
//                {
//                    DocumentSnapshot doc = task.getResult();
//
//                    if(doc.exists())
//                    {
//                        long count = (long)doc.get("COUNT");
//
//                        for(int i=1; i <= count; i++)
//                        {
//                            String catName = doc.getString("CAT" + String.valueOf(i) + "_NAME");
//                            String catID = doc.getString("CAT" + String.valueOf(i) + "_ID");
//
//                            catList.add(new CategoryModel(catID,catName));
//                        }
//
//
//                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                        startActivity(intent);
//                        SplashActivity.this.finish();
//
//                    }
//                    else
//                    {
//                        Toast.makeText(SplashActivity.this,"No Category Document Exists!",Toast.LENGTH_SHORT).show();
//                        finish();
//                    }
//
//                }
//                else
//                {
//
//                    Toast.makeText(SplashActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//    }
}
