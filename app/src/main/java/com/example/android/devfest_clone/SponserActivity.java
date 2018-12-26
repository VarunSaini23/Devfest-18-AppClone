package com.example.android.devfest_clone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.luhuan.banner.RecyclerBanner;

import java.util.ArrayList;
import java.util.List;

public class SponserActivity extends AppCompatActivity {


    List<String> imdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponser);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerBanner<Integer> banner= (RecyclerBanner<Integer>) findViewById(R.id.banner);
        List<Integer> list=new ArrayList<>();
        list.add(R.mipmap.deepika);
        list.add(R.mipmap.ranbir);
        list.add(R.mipmap.mad154);
        list.add(R.mipmap.shraddha);
        list.add(R.mipmap.deepika);
        list.add(R.mipmap.ranbir);
        list.add(R.mipmap.mad154);
        list.add(R.mipmap.shraddha);
        banner.setImages(list);
        banner.startAuto();

        setTitle("Sponser");

        imdb = new ArrayList<>();
        imdb.add("https://www.imdb.com/name/nm2138653/");
        imdb.add("https://www.imdb.com/name/nm1633541/");
        imdb.add("https://www.imdb.com/title/tt1392190/");
        imdb.add("https://www.imdb.com/name/nm3601766/");
        imdb.add("https://www.imdb.com/name/nm2138653/");
        imdb.add("https://www.imdb.com/name/nm1633541/");
        imdb.add("https://www.imdb.com/title/tt1392190/");
        imdb.add("https://www.imdb.com/name/nm3601766/");


        banner.setOnBannerItemClickListener(new RecyclerBanner.OnBannerItemClickListener<Integer>() {
            @Override
            public void onBannerItemClick(int itemPosition, Integer integer) {
                Intent i = new Intent(SponserActivity.this,WebActivity.class);
                i.putExtra("url",imdb.get(itemPosition));
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
