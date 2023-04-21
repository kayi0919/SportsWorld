package com.example.sportsworld.homepage;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

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

        Button r_nextPageRepair = findViewById(R.id.h_repair);
        r_nextPageRepair.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(Home.this, Repair.class);
            startActivity(intent);
        });

        Button r_nextPageSetting = findViewById(R.id.h_setting);
        r_nextPageSetting.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(Home.this, Setting.class);
            startActivity(intent);
        });

        Button r_nextPageArticle = findViewById(R.id.h_article);
        r_nextPageArticle.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(Home.this, Article.class);
            startActivity(intent);
        });

        Button r_nextPageMenu = findViewById(R.id.h_menu);
        r_nextPageMenu.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(Home.this, Repair.class);
            startActivity(intent);
        });

        Button sosButton = findViewById(R.id.h_emergency);
        sosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 檢查權限是否已授予
                if (ContextCompat.checkSelfPermission(Home.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // 如果未授予權限，則請求權限
                    ActivityCompat.requestPermissions(Home.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                } else {
                    // 如果已授予權限，
                    //ACTION_CALL是馬上打
                    //ACTION_DIAL開啟撥號介面
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:119"));
                    startActivity(callIntent);
                }
            }
        });
    }

    // 接收權限請求的結果
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 如果用戶授予權限，則執行打電話的程式碼
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:119"));
                startActivity(callIntent);
            }
        }
    }
}
