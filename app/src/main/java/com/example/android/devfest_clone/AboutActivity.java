package com.example.android.devfest_clone;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Typeface tf1 = Typeface.createFromAsset(getAssets(), "fonts/Montserrat.ttf");

        setTitle("About");
        getSupportActionBar().setHomeButtonEnabled(true);
        int[] tv = {R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4,R.id.tv5,R.id.tv6,R.id.tv7,R.id.tv8};
        for (int i=0;i<8;i++) {
            TextView tv1 = findViewById(tv[i]);
            tv1.setTypeface(tf1);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
