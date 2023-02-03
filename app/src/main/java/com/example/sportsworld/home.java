package com.example.sportsworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton nextPageBtn = (ImageButton)findViewById(R.id.news);
        nextPageBtn.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(home.this, news.class);
            startActivity(intent);
        });
        ImageButton nextPageBtn2 = (ImageButton)findViewById(R.id.home);
        nextPageBtn2.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(home.this, home.class);
            startActivity(intent);
        });
        ImageButton nextPageBtntku = (ImageButton)findViewById(R.id.tku);
        nextPageBtntku.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(home.this, TKU.class);
            startActivity(intent);
        });
    }
}