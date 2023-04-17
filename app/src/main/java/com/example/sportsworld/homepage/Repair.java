package com.example.sportsworld.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sportsworld.R;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Repair extends AppCompatActivity {
    private Button r_article, r_menu, r_home, r_repair, r_running;
    EditText editId, editDescription,editOther;
    Button buttonSubmit;
    TextView textViewResult;

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

        editId = findViewById(R.id.r_id);
        editDescription = findViewById(R.id.r_description);
        editOther = findViewById(R.id.r_other);
        buttonSubmit = findViewById(R.id.r_send);
        textViewResult = findViewById(R.id.r_textViewResult);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = editId.getText().toString().trim();
                String description = editDescription.getText().toString().trim();
                String other = editOther.getText().toString().trim();

                if (id.isEmpty() || description.isEmpty()) {
                    textViewResult.setText("請填寫完整資訊");
                    return;
                }

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            URL url = new URL("http://10.0.2.2/repair.php");
                            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                            connection.setRequestMethod("POST");
                            connection.setDoOutput(true);
                            connection.setDoInput(true);
                            connection.setUseCaches(false);
                            connection.connect();

                            String data = "id=" + URLEncoder.encode(id, "UTF-8")
                                    + "&description=" + URLEncoder.encode(description, "UTF-8")
                                    + "&other=" + URLEncoder.encode(other, "UTF-8");

                            connection.getOutputStream().write(data.getBytes());

                            int responseCode = connection.getResponseCode();
                            if (responseCode == HttpURLConnection.HTTP_OK) {
                                InputStream inputStream = connection.getInputStream();
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"), 8);
                                String box = "";
                                String line = null;
                                while ((line = bufferedReader.readLine()) != null) {
                                    box += line + "\n";
                                }
                                inputStream.close();
                                final String result = box;
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        //TODO 維修失敗也會換頁面
                                        textViewResult.setText(result);
                                    }
                                });
                            } else {
                                throw new Exception("HTTP response code: " + responseCode);
                            }
                        } catch (Exception e) {
                            final String error = e.toString();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    textViewResult.setText(error);
                                }
                            });
                        }
                    }
                });
                thread.start();
            }
        });
    }
}
