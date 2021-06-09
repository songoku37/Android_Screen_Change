package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout); // second_layout 화면 가져옴
        Intent it = getIntent(); // 앞전 화면에서 보낸 데이터를 받아올 때 사용

        String result = it.getStringExtra("name"); // 가져올 데이터 명
        tv = findViewById(R.id.TXT);
        tv.setText(result); // tv객체에 result를 반환
    }

}