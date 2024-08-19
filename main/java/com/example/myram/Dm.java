package com.example.myram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dm extends AppCompatActivity {

    private Button button39;

    private Button button44;

    private Button button45;

    private Button button46;

    private Button button47;


    private Button button48;

    private Button button49;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm);

        button39 = findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bk();
            }
        });

        button44 = findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ho();
            }
        });

        button45 = findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1();
            }
        });


        button46 = findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2();
            }
        });


        button47 = findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3();
            }
        });

        button48 = findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4();
            }
        });


        button49 = findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5();
            }
        });







    }

    public void bk(){
        Intent intent = new Intent(this, cse.class);
        startActivity(intent);
    }


    public void ho(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void m1(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JwthdubHthOlUyo_hMZsxOZZbLl-wdaQ/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m2(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JveRD7DMKGYwj1iJ-ZtKbEPGGObMUpGp/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m3(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Jv5z2E5z-iPkEZFFtsb4hWcdz_ismkne/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m4(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JthwUwx1EBNSVeEZtgIZ-4BKK-XzNwit/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m5(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JtPCiKDC8eizCXxjoLbqKdPnmwyqKn5W/view?usp=drive_link"));
        startActivity(intent);
    }




}