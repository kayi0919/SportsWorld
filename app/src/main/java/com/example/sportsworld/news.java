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

        ImageButton nextPageBtnnews = (ImageButton)findViewById(R.id.news);
        nextPageBtnnews.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, news.class);
            startActivity(intent);
        });

        ImageButton nextPageBtnhome = (ImageButton)findViewById(R.id.home);
        nextPageBtnhome.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, home.class);
            startActivity(intent);
        });

        ImageButton nextPageBtntku = (ImageButton)findViewById(R.id.tku);
        nextPageBtntku.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(news.this, TKU.class);
            startActivity(intent);
        });

    }

}
