package com.cookandriod.moblieprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    CalculateHelper calculateHelper;

    boolean isDot;
    boolean isBracket;
    boolean isPreview;

    TextView textView;
    TextView textView2;

    int size;
    String result;

    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button clear;
    Button percent;
    Button dot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        calculateHelper = new CalculateHelper();

        size=0;
        setButton();
        setTextView();

    }

    private void setButton(){
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        clear = findViewById(R.id.clear);
        percent = findViewById(R.id.percent);

        dot = findViewById(R.id.dot);



        num0.setOnClickListener(numClickListener);
        num1.setOnClickListener(numClickListener);
        num2.setOnClickListener(numClickListener);
        num3.setOnClickListener(numClickListener);
        num4.setOnClickListener(numClickListener);
        num5.setOnClickListener(numClickListener);
        num6.setOnClickListener(numClickListener);
        num7.setOnClickListener(numClickListener);
        num8.setOnClickListener(numClickListener);
        num9.setOnClickListener(numClickListener);

        add.setOnClickListener(markClickListener);
        sub.setOnClickListener(markClickListener);
        mul.setOnClickListener(markClickListener);
        div.setOnClickListener(markClickListener);
        clear.setOnClickListener(markClickListener);
        percent.setOnClickListener(markClickListener);

        dot.setOnClickListener(markClickListener);

    }

    Button.OnClickListener numClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();

            if (id == R.id.num0) {
                textView.append("0");
            } else if (id == R.id.num1) {
                textView.append("1");
            } else if (id == R.id.num2) {
                textView.append("2");
            } else if (id == R.id.num3) {
                textView.append("3");
            } else if (id == R.id.num4) {
                textView.append("4");
            } else if (id == R.id.num5) {
                textView.append("5");
            } else if (id == R.id.num6) {
                textView.append("6");
            } else if (id == R.id.num7) {
                textView.append("7");
            } else if (id == R.id.num8) {
                textView.append("8");
            } else if (id == R.id.num9) {
                textView.append("9");
            }
            preview();
        }
    };

    Button.OnClickListener markClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id = v.getId();

            if (id == R.id.add) {
                textView.append(" + ");
                isPreview = true;
            } else if (id == R.id.sub) {
                textView.append(" - ");
                isPreview = true;
            } else if (id == R.id.mul) {
                textView.append(" * ");
                isPreview = true;
            } else if (id == R.id.div) {
                textView.append(" / ");
                isPreview = true;
            } else if (id == R.id.percent) {
                textView.append(" % ");
                isPreview = true;
            } else if (id == R.id.clear) {
                textView.setText("");
                textView2.setText("");

                calculateHelper = new CalculateHelper();

                isPreview = false;
            } else if (id == R.id.dot) {
                textView.append(".");
                isDot = true;
            }
        }

    };

    private void preview(){
        if(isPreview){
            result = textView.getText().toString();
            double r = calculateHelper.process(result);

            if(!isDot){
                textView2.setText(String.valueOf((int)r));
            }else{
                textView2.setText(String.valueOf(r));
            }
        }
    }

    private void setTextView(){
        textView = findViewById(R.id.first_textView);
        textView2 = findViewById(R.id.second_textView);
    }
}