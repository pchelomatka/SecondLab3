package com.example.a79996.secondlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView textView15 = findViewById(R.id.textView15);
        mCount++;
        textView15.setText(mCount.toString());
    }

    public void onClick2(View view) {
        TextView textView16 = findViewById(R.id.textView16);
        mCount2++;
        textView16.setText(mCount2.toString());
    }

    public void onClick3(View view) {
        TextView textView19 = findViewById(R.id.textView19);
        mCount3++;
        textView19.setText(mCount3.toString());
    }

    public void onClick4(View view) {
        TextView textView20 = findViewById(R.id.textView20);
        mCount4++;
        textView20.setText(mCount4.toString());
    }

    public void onClick5(View view) {
        TextView textView15 = findViewById(R.id.textView15);
        TextView textView16 = findViewById(R.id.textView16);
        TextView textView19 = findViewById(R.id.textView19);
        TextView textView20 = findViewById(R.id.textView20);
        mCount=0;
        mCount2=0;
        mCount3=0;
        mCount4=0;
        textView15.setText("0");
        textView16.setText("0");
        textView19.setText("0");
        textView20.setText("0");
    }



//    private TextView textView5;
    private Button mCounterGoals;
    private Integer mCount=0;
    private Integer mCount2=0;
    private Integer mCount3=0;
    private Integer mCount4=0;
}
