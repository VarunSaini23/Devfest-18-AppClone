package com.example.android.devfest_clone;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerVIewAdapter extends RecyclerView.Adapter<RecyclerVIewAdapter.RecyclerVIewHolder>{

    public ArrayList<Agenda_List> s ;
    AssetManager assetManager;

    public RecyclerVIewAdapter(ArrayList<Agenda_List> s){
        this.s = s;
    }

    @NonNull
    @Override
    public RecyclerVIewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.agenda_list,viewGroup,false);

        assetManager = viewGroup.getContext().getAssets();

        return new RecyclerVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVIewHolder recyclerVIewHolder, int i) {
        Typeface typeface1 = Typeface.createFromAsset(assetManager, "fonts/Montserrat.ttf");

        Log.e("ai", "i: "+ i);
        int ag_image = s.get(i).ag_image;
        String ag_heading = s.get(i).ag_heading;
        String ag_time = s.get(i).ag_time;
        String ag_date = s.get(i).ag_date;

        if(i==0||i==9){
            recyclerVIewHolder.date.setVisibility(View.VISIBLE);
            recyclerVIewHolder.date.setText(ag_date);
            Log.e("a", "onBindViewHolder: "+ ag_date);
            recyclerVIewHolder.date.setTypeface(typeface1);

        }

            if(ag_heading.equals("Networking Session")){
                recyclerVIewHolder.view.setVisibility(View.VISIBLE);
            }
            recyclerVIewHolder.imgIcon.setImageResource(ag_image);
            recyclerVIewHolder.txtTitle.setText(ag_heading);
            recyclerVIewHolder.txtTime.setText(ag_time);


        recyclerVIewHolder.txtTitle.setTypeface(typeface1);
        recyclerVIewHolder.txtTime.setTypeface(typeface1);

    }

    @Override
    public int getItemCount() {
        return s.size();

    }


    public class RecyclerVIewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtTime;
        View view;
        TextView date;
        CardView card_view;

        public RecyclerVIewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtTime = itemView.findViewById(R.id.txtTime);
            view = itemView.findViewById(R.id.view);
            date = itemView.findViewById(R.id.date);
            card_view = itemView.findViewById(R.id.card_view);


        }
    }
}
