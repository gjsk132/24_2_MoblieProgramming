package com.cookandriod.moblieprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnDiff, btnMulti, btnDiv, btnRemainder;
    TextView textResult;
    String num1, num2;
    Double result;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.input1);
        edit2 = (EditText) findViewById(R.id.input2);
        btnAdd = (Button) findViewById(R.id.add);
        btnDiff = (Button) findViewById(R.id.diff);
        btnMulti = (Button) findViewById(R.id.mult);
        btnDiv = (Button) findViewById(R.id.div);
        btnRemainder = (Button) findViewById(R.id.remainder);
        textResult = (TextView) findViewById(R.id.result);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (Objects.equals(num1, "") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                result = Math.round(result*1000000)/1000000.0;
                textResult.setText("계산 결과 : " + result.toString());
                
                
            }
        });

        btnDiff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (Objects.equals(num1, "") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                result = Math.round(result*1000000)/1000000.0;
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (Objects.equals(num1, "") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                result = Math.round(result*1000000)/1000000.0;
                textResult.setText("계산 결과 : " + result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                
                if (Objects.equals(num1, "") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                
                if (Double.parseDouble(num2) == 0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    result = Math.round(result*1000000)/1000000.0;
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnRemainder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (Objects.equals(num1, "") || num2.equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (Double.parseDouble(num2) == 0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }else{
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    result = Math.round(result*1000000)/1000000.0;
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
    }
}