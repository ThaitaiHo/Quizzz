package com.example.quizz;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.List;

public class Playing extends AppCompatActivity implements View.OnClickListener {
    private TextView question, qCount, timer;
    private Button option1, option2, option3, option4;
    private List <Question> questionList;
    private int quesNum;
    private CountDownTimer countDown;
    private int score;
    private FirebaseFirestore firestore;
    private int setNo;
    private Dialog loadingDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing);

        question = findViewById(R.id.question);
        qCount = findViewById(R.id.quest_num);
        timer = findViewById(R.id.countdown);

        option1 = findViewById(R.id.A_btn);
        option2 = findViewById(R.id.B_btn);
        option3 = findViewById(R.id.C_btn);
        option4 = findViewById(R.id.D_btn);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        loadingDialog = new Dialog(Playing.this);
        loadingDialog.setContentView(R.layout.loading_progressbar);
        loadingDialog.setCancelable(false);
        loadingDialog.getWindow().setBackgroundDrawableResource(R.drawable.progress_background);
        loadingDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        loadingDialog.show();

        questionList = new ArrayList<>();

        setNo = getIntent().getIntExtra("SETNO",1);
        firestore = FirebaseFirestore.getInstance();

//        getQuestionsList();

        score = 0;

    }

    @Override
    public void onClick(View v) {

    }

//    private void getQuestionsList()
//    {
//        questionList.clear();
//
//        CookieHandler setsIDs;
//        firestore.collection("Level").document("Easy")
//                .collection(setsIDs.get(setNo)).get()
//                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//                    @Override
//                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//
//                        Map<String, QueryDocumentSnapshot> docList = new ArrayMap<>();
//
//                        for(QueryDocumentSnapshot doc : queryDocumentSnapshots)
//                        {
//                            docList.put(doc.getId(),doc);
//                        }
//
//                        QueryDocumentSnapshot quesListDoc  = docList.get("QUESTIONS_LIST");
//
//                        String count = quesListDoc.getString("COUNT");
//
//                        for(int i=0; i < Integer.valueOf(count); i++)
//                        {
//                            String quesID = quesListDoc.getString("Q" + String.valueOf(i+1) + "_ID");
//
//                            QueryDocumentSnapshot quesDoc = docList.get(quesID);
//
//                            questionList.add(new Question(
//                                    quesDoc.getString("Question"),
//                                    quesDoc.getString("A"),
//                                    quesDoc.getString("B"),
//                                    quesDoc.getString("C"),
//                                    quesDoc.getString("D"),
//                                    Integer.valueOf(quesDoc.getString("Answer"))
//                            ));
//
//                        }
//
//                        setQuestion();
//
//                        loadingDialog.dismiss();
//
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Toast.makeText(Playing.this,e.getMessage(), Toast.LENGTH_SHORT).show();
//                        loadingDialog.dismiss();
//                    }
//                });
//
//    }

}
