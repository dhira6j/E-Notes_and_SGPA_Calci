package com.example.myram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cgv extends AppCompatActivity {

    private Button button29;

    private Button button30;

    private Button button31;

    private Button button32;

    private Button button33;

    private Button button34;

    private Button button35;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgv);

        button29 = findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pre();
            }
        });

        button30 = findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hm();
            }
        });

        button31 = findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1();
            }
        });

        button32 = findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2();
            }
        });

        button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3();
            }
        });

        button34 = findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4();
            }
        });

        button35 = findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5();
            }
        });





    }

    public void pre(){

        Intent intent = new Intent(this, cse.class);
        startActivity(intent);

    }

    public void hm(){
         Intent intent = new Intent(this,MainActivity.class);
         startActivity(intent);
    }

    public void m1(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JS4AIf0XtGMeuqpQ5y34eiJE_tgZ_4VN/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m2(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JO4sGKUPf4-eByrrVcgGfYWZNmgIScoK/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m3(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1JMZQ5BAW7fM4c92ZQWW44w7Ew5NJmvIG/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m4(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1J8iKiZg55c4munW3ezjCbVLUXi5Q5q_H/view?usp=drive_link"));
        startActivity(intent);
    }

    public void m5(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1J72Tik2Tm2lZpAk3-aTbzifeHrg9SsMO/view?usp=drive_link"));
        startActivity(intent);

    }


}