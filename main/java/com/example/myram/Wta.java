package com.example.myram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wta extends AppCompatActivity {

    private Button button36;

    private Button button37;

    private Button button38;

    private Button button40;

    private Button button41;


    private Button button42;


    private Button button43;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wta);

        button36 = findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bck();
            }
        });

        button37 = findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hom();
            }
        });

        button38 = findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1();
            }
        });

        button40 = findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2();
            }
        });

        button41 = findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3();
            }
        });

        button42 = findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4();
            }
        });

        button43 = findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5();
            }
        });






    }

    public void bck(){
        Intent intent = new Intent(this, cse.class);
        startActivity(intent);
    }

    public void hom(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void m1(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1J0aUYKVB__oVtitR25AqVZ3zJKOzewQ2/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m2(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Ix-Uwb1zwzmECuAEw28tri_NOezDDtIh/view?usp=drive_link"));
        startActivity(intent);
    }


    public void m3(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1IoPVh_4pIPUqVCAyuUGtcOUo7LBnuvak/view?usp=drive_link"));
        startActivity(intent);
    }


    public void m4(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1IoEWkICgLsKFDE0B6rz5DBrv6J0jIrvv/view?usp=drive_link"));
        startActivity(intent);
    }


    public void  m5(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1InKlO6hJcrSIKbEg9ODK069sU0PiV6gT/view?usp=drive_link"));
        startActivity(intent);
    }







}