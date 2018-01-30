package com.ezminz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class    MainActivity extends AppCompatActivity {


    private EditText etnumberOne;
    private EditText etnumberTwo;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumberOne = findViewById(R.id.etnumberOne)
        etnumberTwo = findViewById(R.id.etnumberTwo)
        btnDivide =   findViewById(R.id.btnDivide)
        btnPlus =   findViewById(R.id.btnPlus)
        btnMinus =   findViewById(R.id.btnMinus)
        btnMultiply =   findViewById(R.id.btnMultiply)



        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etnumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etnumberTwo.getText().toString());
                Plus(numberOne,numberTwo);

                    }
                });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etnumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etnumberTwo.getText().toString());
                Divide(numberOne,numberTwo);

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etnumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etnumberTwo.getText().toString());
                Minus(numberOne,numberTwo);

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etnumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etnumberTwo.getText().toString());
                Multiply(  numberOne,numberTwo);

            }
        });
    }

    private  void Plus( int numberOne,int numberTwo){
        int result numberOne + numberTwo;
        return result;
    }
    private  void Minus( int numberOne,int numberTwo){
        int result numberOne - numberTwo;
        return result;
    }
    private  void Multiply( int numberOne,int numberTwo){
        int result numberOne x numberTwo;
        return result;
    }
    private  void Divide( int numberOne,int numberTwo){
        int result numberOne / numberTwo;
        return result;
    }
}
