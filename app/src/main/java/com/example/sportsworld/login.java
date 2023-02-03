package com.example.sportsworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button nextPageBtn = (Button)findViewById(R.id.button_createacct);
        nextPageBtn.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(login.this, createacct.class);
            startActivity(intent);
        });

        Button nextPageBtn1 = (Button)findViewById(R.id.button_login);
        nextPageBtn1.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(login.this, home.class);
            startActivity(intent);
        });
    }

}
