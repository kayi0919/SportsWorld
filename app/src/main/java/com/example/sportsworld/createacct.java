package com.example.sportsworld;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class createacct extends AppCompatActivity {
    @Override
    //TODO Database
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createacct);

        Button nextPageBtn = (Button)findViewById(R.id.button_Go);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(createacct.this, home.class);
                startActivity(intent);
            }
        });
    }
}
