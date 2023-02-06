package com.example.sportsworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity{
    @Override
    //TODO Database
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button nextPageCreateAcct = (Button)findViewById(R.id.button_createacct);
        nextPageCreateAcct.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(login.this, createacct.class);
            startActivity(intent);
        });

        Button nextPageLogin = (Button)findViewById(R.id.button_login);
        nextPageLogin.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(login.this, home.class);
            startActivity(intent);
        });
    }

}
