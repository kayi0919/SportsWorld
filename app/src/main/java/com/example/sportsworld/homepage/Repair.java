package com.example.sportsworld.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportsworld.R;

public class Repair extends AppCompatActivity {
    private Button r_article, r_menu, r_home, r_repair, r_running;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.repair);

        r_article = findViewById(R.id.r_article);
        r_menu = findViewById(R.id.r_menu);
        r_home = findViewById(R.id.r_home);
        r_repair = findViewById(R.id.r_repair);
        r_running = findViewById(R.id.r_running);

        // 設置首頁按鈕的背景顏色
        r_home.setBackgroundColor(Color.GREEN);
        r_article.setBackgroundColor(Color.GREEN);
        r_menu.setBackgroundColor(Color.GREEN);
        r_repair.setBackgroundColor(Color.RED);
        r_running.setBackgroundColor(Color.GREEN);

        Button nextPageStart = findViewById(R.id.h_repair);
        nextPageStart.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(Repair.this,Home.class);
            startActivity(intent);
        });
    }
}
