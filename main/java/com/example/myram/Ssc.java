package com.example.myram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ssc extends AppCompatActivity {

    private Button button15;

    private Button button14;

    private Button button18;

    private Button button19;

    private Button button26;

    private Button button27;

    private Button button28;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssc);

        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hom();
            }
        });

        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bac();
            }
        });

        button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1();
            }
        });

        button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2();
            }
        });

        button26 = findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3();
            }
        });

        button27 = findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4();
            }
        });

        button28 = findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5();
            }
        });



    }

    public void hom(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void bac(){
        Intent intent = new Intent(this,cse.class);
        startActivity(intent);
    }

    public void m1(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Jd1gg14suLnl-uYAXOFtZ6Y6DUlHPcYX/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m2(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JcQcskyGYg0ayRQUuS_Z_7USWUUhbgky/view?usp=drive_link"));
        startActivity(intent);
    }

    public  void m3(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JWVvWLEN5Zi7stk7Ttvy0MoBFBSCJRD7/view?usp=drive_link"));
        startActivity(intent);

    }

    public void  m4(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JT6-lqTqO5QCCmXzJXZE4NOm_1c1tGbj/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m5(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JT-TskUcgohI9ZCNlmnaEEOuClD-3J0V/view?usp=drive_link"));
        startActivity(intent);
    }


}