package com.example.sportsworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TKU extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tku);

        ImageButton nextPageBtnnews = (ImageButton)findViewById(R.id.news);
        nextPageBtnnews.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(TKU.this, news.class);
            startActivity(intent);
        });

        ImageButton nextPageBtnhome = (ImageButton)findViewById(R.id.home);
        nextPageBtnhome.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(TKU.this, home.class);
            startActivity(intent);
        });

        ImageButton nextPageBtntku = (ImageButton)findViewById(R.id.tku);
        nextPageBtntku.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(TKU.this, TKU.class);
            startActivity(intent);
        });

    }

}
