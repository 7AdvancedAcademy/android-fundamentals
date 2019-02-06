package com.example.basiccalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculationActivity extends AppCompatActivity {


    double result;
    String operand,
           title;
    TextView resultField,
             operandTitle,
             operationTitle;
    int accessMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        // Retrieving accessor from the intent
        accessMod = getIntent().getIntExtra("operand", 0);

        switch (accessMod) {
            case 1 :
                title = "Addition";
                operand = "+";
                break;

            case 2 :
                title = "Subtraction";
                operand = "-";
                break;

            case 3:
                title = "Multiplication";
                operand = "x";
                break;

            case 4 :
                title = "Division";
                operand = "÷";
                break;

        }

        // Setting operand
        operandTitle =  findViewById(R.id.operand);
        operandTitle.setText(operand);

        // Setting title
        operationTitle = findViewById(R.id.operation_title);
        operationTitle.setText(title);
    }

    public void clickOnEqualButton(View v) {

        // Capturing the user's first input
        EditText firstNumber = findViewById(R.id.first_input);
        String numb1 = firstNumber.getText().toString();
        double nb1 = Double.parseDouble(numb1);

        // Capturing user's second input
        EditText secondNumber = findViewById(R.id.second_input);
        String numb2 = secondNumber.getText().toString();
        double nb2 = Double.parseDouble(numb2);

        // Calculating
        doOperation(accessMod, nb1, nb2);

        // Printing result
        resultField = findViewById(R.id.result_field);
        resultField.setText(String.valueOf(result));


    }

    public void doOperation (int accessor, double a, double b) {

        switch (accessor) {
            case 1 :
                result =  a + b;
                break;

            case 2 :
                result = a - b;
                break;

            case 3 :
                result = a * b;
                break;

            case 4 :

                if (a >= b) {
                    result = a / b;
                    break;
                } else {

                    // WHy is this part of code is not executed ?
                    Toast.makeText(this, "There you are... Served!!!!", Toast.LENGTH_LONG).show();
                    resultField.setText("Error");
                }
                break;

        }

        //return result;
    }
}
