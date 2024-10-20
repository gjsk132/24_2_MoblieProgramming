package com.cookandriod.moblieprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Assignment_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);

        TextView nameTextView = findViewById(R.id.Name);
        TextView engNameTextView = findViewById(R.id.engName);
        TextView emailTextView = findViewById(R.id.email);
        TextView phoneTextView = findViewById(R.id.phoneNumber);
        TextView homepageTextView = findViewById(R.id.homepage);
        nameTextView.setText("허나영");
        engNameTextView.setText("Na-yeong Heo");
        emailTextView.setText("gjsk132@gmail.com");
        phoneTextView.setText("+82-10-5767-4108");
        homepageTextView.setText("https://github.com/gjsk132");

        ImageView resumeImageView = findViewById(R.id.resumeImage);
        resumeImageView.setImageResource(R.drawable.hny_image);

        String[][] educationData = {
                {"2022-02-08", "부산서여자고등학교", "-"},
                {"2022-03-02 ~", "국립부경대학교", "의공학IT융합전공"},
                {"2024-03-04 ~", "국립부경대학교", "컴퓨터공학전공"}
        };

        String[][] careerData = {
                {"2022-03-18\n~2022-12-31", "13대 의공학전공 학생회 RE:WIND\n사무부원"},
                {"2022-09-09 ~", "개발중앙동이리 WAP 25기\n회원"},
                {"2023-01-01\n~2023-12-31", "14대 의공학전공 학생회 WE GO\n홍보부장"},
                {"2023-01-02\n~2023-12-31", "개발중앙동이리 WAP\n임원진"},
                {"2024-01-01 ~", "15대 의공학전공 학생회 RUSH\n총무부장"}
        };

        String[][] certificationsData = {
                {"1종 보통 운전면허", "2022-03-14"},
                {"데이터 분석 준전문가", "2024-03-22"}
        };

        String[][] awardsData = {
                {"정보융합대학 프로그래밍 경진대회 장려상", "2023-11-09"},
                {"정보융합대학 프로그래밍 경진대회 장려상", "2024-05-05"}
        };

        TableLayout educationTable = findViewById(R.id.educationTable);
        TableLayout careerTable = findViewById(R.id.careerTable);
        TableLayout certificationsTable = findViewById(R.id.certificationsTable);
        TableLayout awardsTable = findViewById(R.id.awardsTable);

        addTableData(educationTable, educationData);
        addTableData(careerTable, careerData);
        addTableData(certificationsTable, certificationsData);
        addTableData(awardsTable, awardsData);

    }

    private void addTableData(TableLayout table, String[][] data){
        for (String[] row: data){
            TableRow newRow = createTableRow(row);
            table.addView(newRow);
        }
    }

    private TableRow createTableRow(String[] rowData){
        TableRow tableRow = new TableRow(this);

        for (String data:rowData){
            TextView textView = new TextView(this);
            textView.setText(data);
            textView.setPadding(0,5,0,0);
            textView.setTextColor(getResources().getColor(R.color.black));
            tableRow.addView(textView);
        }
        return tableRow;
    }
}