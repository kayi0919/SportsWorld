package com.example.sportsworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class news extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ImageButton nextPageNews = (ImageButton)findViewById(R.id.news);
        nextPageNews.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, news.class);
            startActivity(intent);
        });

        ImageButton nextPageHome = (ImageButton)findViewById(R.id.home);
        nextPageHome.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, home.class);
            startActivity(intent);
        });

        ImageButton nextPageTku = (ImageButton)findViewById(R.id.tku);
        nextPageTku.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, TKU.class);
            startActivity(intent);
        });
        ImageButton nextPageSport = (ImageButton)findViewById(R.id.sport);
        nextPageSport.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, TKU.class);
            startActivity(intent);
        });
        ImageButton nextPageProfile = (ImageButton)findViewById(R.id.profile);
        nextPageProfile.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, TKU.class);
            startActivity(intent);
        });

    }

}
