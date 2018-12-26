package com.example.android.devfest_clone;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuizQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question);

        Bundle b = getIntent().getExtras();
        String option = b.getString("option");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView textView = findViewById(R.id.text);

        if (option.equals("Quiz")){
            textView.setText(R.string.quiz);
            setTitle("Quiz");
        }else if (option.equals("Questions")){
            textView.setText(R.string.questions);
            setTitle("Questions");
        }

        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/Montserrat.ttf");
        textView.setTypeface(tf1);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;

    }
}
