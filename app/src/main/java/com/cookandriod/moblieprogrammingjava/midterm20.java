package com.cookandriod.moblieprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class midterm20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm20);

        Button LeftBtn = findViewById(R.id.leftBtn);
        Button RightBtn = findViewById(R.id.rightBtn);
        VideoView backVideo = findViewById(R.id.videoView1);
        VideoView jajagVideo = findViewById(R.id.jajangmen);
        TextView mention = findViewById(R.id.mention);

        final Integer[] BtnStatus = {0};

        LeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LeftBtn.setBackgroundColor(Color.parseColor("#"+getRandom8BitHexString()));
                if (BtnStatus[0] != 1){
                    jajagVideo.setVisibility(View.VISIBLE);
                    mention.setVisibility(View.GONE);
                    RightBtn.setBackgroundColor(Color.parseColor("#6750a4"));
                    BtnStatus[0] = 1;
                }
            }
        });

        RightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RightBtn.setBackgroundColor(Color.parseColor("#"+getRandom8BitHexString()));
                if (BtnStatus[0] != 2) {
                    jajagVideo.setVisibility(View.GONE);
                    mention.setVisibility(View.VISIBLE);
                    LeftBtn.setBackgroundColor(Color.parseColor("#6750a4"));
                    BtnStatus[0] = 2;
                }
            }
        });
    }

    private String getRandom8BitHexString() {
        String hexString = "";
        for (int i=0; i<6; i++) {
            hexString += Integer.toHexString((int) (Math.random() * 16) + 1).toUpperCase();
        }
        return hexString;
    }

}