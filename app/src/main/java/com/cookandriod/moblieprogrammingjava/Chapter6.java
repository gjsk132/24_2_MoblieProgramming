package com.cookandriod.moblieprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Chapter6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6);
    }

    // callback 함수 지정
    public void onClick(View target){
        Toast.makeText(getApplicationContext(), "버튼이 눌러졌습니다", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage(View view){

    }
}