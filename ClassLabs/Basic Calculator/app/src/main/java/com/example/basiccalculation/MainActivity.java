package com.example.basiccalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOnAdd(View v) {

        Intent intent = new Intent(MainActivity.this, CalculationActivity.class);
        intent.putExtra("operand", 1);
        startActivity(intent);

    }

    public void clickOnMinus(View v) {

        Intent intent = new Intent(MainActivity.this, CalculationActivity.class);
        intent.putExtra("operand", 2);
        startActivity(intent);

    }

    public void clickOnMultiply(View v) {

        Intent intent = new Intent(MainActivity.this, CalculationActivity.class);
        intent.putExtra("operand", 3);
        startActivity(intent);

    }

    public void clickOnDivide(View v) {

        Intent intent = new Intent(MainActivity.this, CalculationActivity.class);
        intent.putExtra("operand", 4);
        startActivity(intent);

    }

/*    public void clickMe(View v) {

        int accessor = 0;

        Intent intent = new Intent(MainActivity.this, CalculationActivity.class);
        intent.putExtra("operand", accessor);
        startActivity(intent);
    }*/

}
