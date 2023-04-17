package com.example.sportsworld.homepage;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportsworld.Login;
import com.example.sportsworld.MainActivity;
import com.example.sportsworld.R;

public class Home extends AppCompatActivity {

    private Button h_article, h_menu, h_home, h_repair, h_running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        h_article = findViewById(R.id.h_article);
        h_menu = findViewById(R.id.h_menu);
        h_home = findViewById(R.id.h_home);
        h_repair = findViewById(R.id.h_repair);
        h_running = findViewById(R.id.h_running);

        // 設置首頁按鈕的背景顏色
        h_home.setBackgroundColor(Color.RED);
        h_article.setBackgroundColor(Color.GREEN);
        h_menu.setBackgroundColor(Color.GREEN);
        h_repair.setBackgroundColor(Color.GREEN);
        h_running.setBackgroundColor(Color.GREEN);

        Button nextPageStart = findViewById(R.id.h_repair);
        nextPageStart.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(Home.this, Repair.class);
            startActivity(intent);
        });
    }
}
