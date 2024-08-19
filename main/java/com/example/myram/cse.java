package com.example.myram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cse extends AppCompatActivity {
    private Button button25;
    private Button button12;
    private Button button24;
    private Button button23;
    private Button button22;

    private Button button21;

    private Button button13;

    private Button button16;

    private Button button17;

    private Button button20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                syllabus();
            }
        });

        button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mad();
            }
        });

        button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cglab();
            }
        });

        button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sslab();
            }
        });

        button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ohs();
            }
        });

        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nex();
            }
        });

        button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

        button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nxt();
            }
        });

        button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nt();
            }
        });








    }

    public void back(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void syllabus(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JzdA_4k10cAOSBKAQ07lLdQYsDMINpRn/view?usp=drive_link"));
        startActivity(intent);
    }

    public void mad(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ks7SWMu0OAVuPZ12HY_vm7QK0p7GCeBp/view?usp=drive_link"));
        startActivity(intent);
    }

    public void cglab(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1InEGx7gjZXs0H033n6CiD7zI3oJ_7w1E/view?usp=drive_link"));
        startActivity(intent);
    }

    public void sslab(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1IdcDshdHkhqk7zXff9vH5n-Mx-2zBfOs/view?usp=drive_link"));
        startActivity(intent);
    }

    public void ohs(){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/drive/folders/15QFcruutXgV5KP7fGfV6KK_X7WwfHXoG"));
        startActivity(intent);
    }

    public void nex(){
        Intent intent = new Intent(this,Ssc.class);
        startActivity(intent);
    }

    public void next(){
        Intent intent = new Intent(this, Cgv.class);
        startActivity(intent);
    }

    public void nxt(){
        Intent intent = new Intent(this, Wta.class);
        startActivity(intent);
    }


    public void nt(){
        Intent intent = new Intent(this, Dm.class);
        startActivity(intent);
    }




}