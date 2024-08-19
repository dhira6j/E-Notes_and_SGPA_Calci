package com.example.myram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class attend extends AppCompatActivity {

    private EditText etSubject1, etSubject2, etSubject3, etSubject4, etSubject5, etSubject6, etSubject7, etSubject8;

    private Button btnres;
    private TextView tvSGPA;

    private Button ClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend);

        // Initialize views
        etSubject1 = findViewById(R.id.etSubject1);
        etSubject2 = findViewById(R.id.etSubject2);
        etSubject3 = findViewById(R.id.etSubject3);
        etSubject4 = findViewById(R.id.etSubject4);
        etSubject5 = findViewById(R.id.etSubject5);
        etSubject6 = findViewById(R.id.etSubject6);
        etSubject7 = findViewById(R.id.etSubject7);
        etSubject8 = findViewById(R.id.etSubject8);
        btnres = findViewById(R.id.btnres);
        tvSGPA = findViewById(R.id.tvSGPA);

        // Calculate button click listener
        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSGPA();
            }
        });


    }

    private void calculateSGPA() {
        // Get input values
        int subject1Credits = 4;
        int subject2Credits = 4;
        int subject3Credits = 4;
        int subject4Credits = 3;
        int subject5Credits = 3;
        int subject6Credits = 2;
        int subject7Credits = 2;
        int subject8Credits = 2;
        int gp, g1, g2, g3, g4, g5, g6, g7, g8;

        // For SSC

        double subject1Grade = getGradeFromInput(etSubject1);
        if (subject1Grade >= 90 && subject1Grade <= 100)
        {
            gp=10;
            g1=4*gp;
        }
        else if (subject1Grade >= 80 && subject1Grade < 90) {
            gp = 9;
            g1 = 4 * gp;
        } else if (subject1Grade >= 70 && subject1Grade < 80) {
            gp = 8;
            g1 = 4 * gp;
        } else if (subject1Grade >= 60 && subject1Grade < 70) {
            gp = 7;
            g1 = 4 * gp;
        } else if (subject1Grade >= 50 && subject1Grade < 60) {
            gp = 6;
            g1 = 4 * gp;
        } else if (subject1Grade >= 45 && subject1Grade < 50) {
            gp = 5;
            g1 = 4 * gp;
        } else if (subject1Grade >= 40 && subject1Grade < 45) {
            gp = 4;
            g1 = 4 * gp;
        } else {
            gp = 0;
            g1 = 4 * gp;
        }

        // For CGV

        double subject2Grade = getGradeFromInput(etSubject2);
        if (subject2Grade >= 90 && subject2Grade <= 100)
        {
            gp = 10;
            g2 = 4 * gp;
        }
        else if (subject2Grade >= 80 && subject2Grade < 90) {
            gp = 9;
            g2 = 4 * gp;
        } else if (subject2Grade >= 70 && subject2Grade < 80) {
            gp = 8;
            g2 = 4 * gp;
        } else if (subject2Grade >= 60 && subject2Grade < 70) {
            gp = 7;
            g2 = 4 * gp;
        } else if (subject2Grade >= 50 && subject2Grade < 60) {
            gp = 6;
            g2 = 4 * gp;
        } else if (subject2Grade >= 45 && subject2Grade < 50) {
            gp = 5;
            g2 = 4 * gp;
        } else if (subject2Grade >= 40 && subject2Grade < 45) {
            gp = 4;
            g2 = 4 * gp;
        } else {
            gp = 0;
            g2 = 4 * gp;
        }


        // For WTA

        double subject3Grade = getGradeFromInput(etSubject3);
        if (subject3Grade >= 90 && subject3Grade <= 100)
        {
            gp = 10;
            g3 = 4 * gp;
        }
        else if (subject3Grade >= 80 && subject3Grade < 90) {
            gp = 9;
            g3 = 4 * gp;
        } else if (subject3Grade >= 70 && subject3Grade < 80) {
            gp = 8;
            g3 = 4 * gp;
        } else if (subject3Grade >= 60 && subject3Grade < 70) {
            gp = 7;
            g3 = 4 * gp;
        } else if (subject3Grade >= 50 && subject3Grade < 60) {
            gp = 6;
            g3 = 4 * gp;
        } else if (subject3Grade >= 45 && subject3Grade < 50) {
            gp = 5;
            g3 = 4 * gp;
        } else if (subject3Grade >= 40 && subject3Grade < 45) {
            gp = 4;
            g3 = 4 * gp;
        } else {
            gp = 0;
            g3 = 4 * gp;
        }

        // For DMDW

        double subject4Grade = getGradeFromInput(etSubject4);

        if (subject4Grade >= 90 && subject4Grade <= 100)
        {
            gp = 10;
            g4 = 3 * gp;
        }
        else if (subject4Grade >= 80 && subject4Grade < 90) {
            gp = 9;
            g4 = 3 * gp;
        } else if (subject4Grade >= 70 && subject4Grade < 80) {
            gp = 8;
            g4 = 3 * gp;
        } else if (subject4Grade >= 60 && subject4Grade < 70) {
            gp = 7;
            g4 = 3 * gp;
        } else if (subject4Grade >= 50 && subject4Grade < 60) {
            gp = 6;
            g4 = 3 * gp;
        } else if (subject4Grade >= 45 && subject4Grade < 50) {
            gp = 5;
            g4 = 3 * gp;
        } else if (subject4Grade >= 40 && subject4Grade < 45) {
            gp = 4;
            g4 = 3 * gp;
        } else {
            gp = 0;
            g4 = 3 * gp;
        }


        // For OHS

        double subject5Grade = getGradeFromInput(etSubject5);

        if (subject5Grade >= 90 && subject5Grade <= 100)
        {
            gp = 10;
            g5 = 3 * gp;
        }
        else if (subject5Grade >= 80 && subject5Grade < 90) {
            gp = 9;
            g5 = 3 * gp;
        } else if (subject5Grade >= 70 && subject5Grade < 80) {
            gp = 8;
            g5 = 3 * gp;
        } else if (subject5Grade >= 60 && subject5Grade < 70) {
            gp = 7;
            g5 = 3 * gp;
        } else if (subject5Grade >= 50 && subject5Grade < 60) {
            gp = 6;
            g5 = 3 * gp;
        } else if (subject5Grade >= 45 && subject5Grade < 50) {
            gp = 5;
            g5 = 3 * gp;
        } else if (subject5Grade >= 40 && subject5Grade < 45) {
            gp = 4;
            g5 = 3 * gp;
        } else {
            gp = 0;
            g5 = 3 * gp;
        }

        // For SSC LAB

        double subject6Grade = getGradeFromInput(etSubject6);

        if (subject6Grade >= 90 && subject6Grade <= 100)
        {
            gp=10;
            g6=2*gp;
        }
        else if (subject6Grade >= 80 && subject6Grade < 90) {
            gp = 9;
            g6 = 2 * gp;
        } else if (subject6Grade >= 70 && subject6Grade < 80) {
            gp = 8;
            g6 = 2 * gp;
        } else if (subject6Grade >= 60 && subject6Grade < 70) {
            gp = 7;
            g6 = 2 * gp;
        } else if (subject6Grade >= 50 && subject6Grade < 60) {
            gp = 6;
            g6 = 2 * gp;
        } else if (subject6Grade >= 45 && subject6Grade < 50) {
            gp = 5;
            g6 = 2 * gp;
        } else if (subject6Grade >= 40 && subject6Grade < 45) {
            gp = 4;
            g6 = 2 * gp;
        } else {
            gp = 0;
            g6 = 2 * gp;
        }


        // For CGV LAB

        double subject7Grade = getGradeFromInput(etSubject7);

        if (subject7Grade >= 90 && subject7Grade <= 100)
        {
            gp = 10;
            g7 = 2 * gp;
        }
        else if (subject7Grade >= 80 && subject7Grade < 90) {
            gp = 9;
            g7 = 2 * gp;
        } else if (subject7Grade >= 70 && subject7Grade < 80) {
            gp = 8;
            g7 = 2 * gp;
        } else if (subject7Grade >= 60 && subject7Grade < 70) {
            gp = 7;
            g7 = 2 * gp;
        } else if (subject7Grade >= 50 && subject7Grade < 60) {
            gp = 6;
            g7 = 2 * gp;
        } else if (subject7Grade >= 45 && subject7Grade < 50) {
            gp = 5;
            g7 = 2 * gp;
        } else if (subject7Grade >= 40 && subject7Grade < 45) {
            gp = 4;
            g7 = 2 * gp;
        } else {
            gp = 0;
            g7 = 2 * gp;
        }


        // For MAD

        double subject8Grade = getGradeFromInput(etSubject8);

        if (subject8Grade >= 90 && subject8Grade <= 100)
        {
            gp = 10;
            g8 = 2 * gp;
        }
        else if (subject8Grade >= 80 && subject8Grade < 90) {
            gp = 9;
            g8 = 2 * gp;
        } else if (subject8Grade >= 70 && subject8Grade < 80) {
            gp = 8;
            g8 = 2 * gp;
        } else if (subject8Grade >= 60 && subject8Grade < 70) {
            gp = 7;
            g8 = 2 * gp;
        } else if (subject8Grade >= 50 && subject8Grade < 60) {
            gp = 6;
            g8 = 2 * gp;
        } else if (subject8Grade >= 45 && subject8Grade < 50) {
            gp = 5;
            g8 = 2 * gp;
        } else if (subject8Grade >= 40 && subject8Grade < 45) {
            gp = 4;
            g8 = 2 * gp;
        } else {
            gp = 0;
            g8 = 2 * gp;
        }




        // Calculate SGPA

        double totalmarks = subject1Grade + subject2Grade + subject3Grade + subject4Grade + subject5Grade + subject6Grade + subject7Grade + subject8Grade;

        double totalCredits = subject1Credits + subject2Credits + subject3Credits +
                subject4Credits + subject5Credits + subject6Credits + subject7Credits + subject8Credits;

        double sgpa = (g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8)/ totalCredits;

        double per = ((subject1Credits * subject1Grade) + (subject2Credits * subject2Grade) +
                (subject3Credits * subject3Grade) + (subject4Credits * subject4Grade) +
                (subject5Credits * subject5Grade) + (subject6Credits * subject6Grade) + (subject7Credits * subject7Grade) + (subject8Credits * subject8Grade)) / totalCredits;

        // Display SGPA

        tvSGPA.setText(String.format("%.2f  SGPA \n %f %% \n Total Marks Scored : %s/800 ", sgpa, per, totalmarks));



        ClearButton = findViewById(R.id.ClearButton);
        ClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });


    }

    private double getGradeFromInput(EditText editText) {
        String input = editText.getText().toString().trim();
        if (input.isEmpty()) {
            return 0.0;
        } else {
            return Double.parseDouble(input);
        }
    }

    public void clear(){

        Intent intent = new Intent(this, attend.class);
        startActivity(intent);
        finish();


    }





}