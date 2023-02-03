package com.example.sportsworld;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button nextPageBtn = findViewById(R.id.start);
        nextPageBtn.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(start.this, loading.class);
            startActivity(intent);
        });
    }
}