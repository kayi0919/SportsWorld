package com.example.sportsworld;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

public class loading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        new Handler().postDelayed(() -> {
            final Intent mainIntent = new Intent(loading.this, login.class);
            startActivity(mainIntent);
            finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
            // 這樣可以避免使用者按 back 後，又回到該 activity。
        }, 300);
    }
}
