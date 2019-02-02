package com.example.helloconstraint;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button count = findViewById(R.id.count_button);
        number = findViewById(R.id.number_field);
        number.setText("0");

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence valueChar = number.getText();
                int valueInt = Integer.parseInt(valueChar.toString());
                valueInt++;
                number.setText(String.valueOf(valueInt));

            }
        });

    }

    public void onClick(View v){

        TextView storedNumber = findViewById(R.id.number_field);
        CharSequence showNumber = storedNumber.getText().toString();
        Toast.makeText(this,showNumber,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putString("saved_number",number.getText().toString());
        super.onSaveInstanceState(outState);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String resumed_number = savedInstanceState.getString("saved_number");
        number.setText(resumed_number);
        Log.d("on restore",resumed_number);

    }
}
