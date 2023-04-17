package com.example.sportsworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextPageStart = findViewById(R.id.bt_start);
        nextPageStart.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Login.class);
            startActivity(intent);
        });
    }
}