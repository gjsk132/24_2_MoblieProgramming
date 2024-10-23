package com.cookandriod.moblieprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Chapter2_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2_1);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo_bme);
    }
}