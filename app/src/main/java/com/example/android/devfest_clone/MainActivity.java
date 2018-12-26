package com.example.android.devfest_clone;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Agenda_List> arrayList = new ArrayList<>();

        arrayList.add(new Agenda_List(R.drawable.baseline_info_white_18dp,"Introduction","9:00AM-10:00AM","6 Oct."));
        arrayList.add(new Agenda_List(R.drawable.baseline_mic_white_18dp,"Speaker - Slanglabs","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_mic_white_18dp,"Speaker - LBRY","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_mic_white_18dp,"Speaker - Agora.io","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_mic_white_18dp,"Lunch","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_info_white_18dp,"Actions on Google","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_info_white_18dp,"Panel Discussion","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_info_white_18dp,"Q&A Session","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_info_white_18dp,"Networking Session","9:00AM-10:00AM"));
        arrayList.add(new Agenda_List(R.drawable.baseline_info_white_18dp,"Introduction","9:00AM-10:00AM","7 Oct."));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerVIewAdapter(arrayList));


        setTitle("Devfest");
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.baseline_reorder_white_18dp);


        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getTitle().equals("Agenda")){
                    Intent i = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                    item.setChecked(true);

                }else if(item.getTitle().equals("Scratch Card")) {
                    Intent i = new Intent(MainActivity.this, ScratchCardActivity.class);
                    startActivity(i);
                    item.setChecked(true);

                }else if(item.getTitle().equals("Quiz")){
                    Intent i = new Intent(MainActivity.this,QuizQuestionActivity.class);
                    i.putExtra("option","Quiz");
                    startActivity(i);
                    item.setChecked(true);

                }else if(item.getTitle().equals("Questions")){
                    Intent i = new Intent(MainActivity.this,QuizQuestionActivity.class);
                    i.putExtra("option","Questions");
                    startActivity(i);
                    item.setChecked(true);

                }else if(item.getTitle().equals("Sponser")){
                    Intent i = new Intent(MainActivity.this, SponserActivity.class);
                    startActivity(i);
                    item.setChecked(true);

                }else if(item.getTitle().equals("About")){
                    Intent i = new Intent(MainActivity.this, AboutActivity.class);
                    startActivity(i);
                    item.setChecked(true);
                }


                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                mDrawerLayout.closeDrawers();
                return true;
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
