package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nameTxT; // layout에 있는 컨텐츠을 객체화할 때 이렇게 함
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 반드시 필요
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // res - layout에 있는 activity_main.xml을 메인 화면으로 가져온다
        // .xml에서 .java를 가져오면 R클래스를 사용해야 한다. R.layout.activity_main
    }

    public void pressButton(View view){ // View 객체란 onclick과 같이 눌렀을때 그 누른 사진따위를 가져옴
        // intent 객체는 전환할 화면의 정보를 제공 ( 현재 Activity, 전환할 Activity의 이름.class)
        // 구성요소 (컴포넌트) 간에 작업 수행을 위한 정보를 전달하는 역할
        nameTxT = (EditText)findViewById(R.id.editName); // R.id.editName이란 layout에 있는 editName에 id값을 의미
        // findViewById : 속성을 가져온다
        name = nameTxT.getText().toString(); //nameTxT의 속성을 Text형식으로 가져온 걸 String 형변환
        Intent it = new Intent(this,SecondActivity.class);
        it.putExtra("name",name); // (전달할 데이터명 , 값) "name" = name
        startActivity(it); // it 매개변수로 받아 실행
    }
}