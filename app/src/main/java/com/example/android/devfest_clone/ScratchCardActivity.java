package com.example.android.devfest_clone;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScratchCardActivity extends AppCompatActivity {

    TextView scratch_main,scratch_check_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scratch_card);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Scratch Card");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/Montserrat.ttf");
        scratch_main = findViewById(R.id.scratch_main);
        scratch_check_back = findViewById(R.id.scratch_check_back);

        scratch_main.setTypeface(tf1);
        scratch_check_back.setTypeface(tf1);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;

    }
}
