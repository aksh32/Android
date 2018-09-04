package com.example.studentadmin.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float valOne;
    float valTwo;
    Button add, sub, multi,devide,log,clr,calc,changecolor;
    TextView Result;
    EditText values;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.Add);
        sub = findViewById(R.id.Subtract);
        multi = findViewById(R.id.Multiply);
        devide = findViewById(R.id.Devision);
        log = findViewById(R.id.LogVal);
        clr = findViewById(R.id.Clear);
        calc = findViewById(R.id.Submit);
        changecolor = findViewById(R.id.Color);
        Result = findViewById(R.id.Result);
        values = findViewById(R.id.NumVal);
    }

    public void Add(View view) {
        if(values == null){
            values.setText("");
        }
        else {
            valOne = Float.parseFloat(values.getText() + "");
            mAddition = true;
            values.setText(null);
        }
    }

    public void subtract(View view) {
        if(values == null){
            values.setText("");
        }
        else {
            valOne = Float.parseFloat(values.getText() + "");
            mSubtract = true;
            values.setText(null);
        }
    }

    public void multiply(View view) {
        if(values == null){
            values.setText("");
        }
        else {
            valOne = Float.parseFloat(values.getText() + "");
            mMultiplication = true;
            values.setText(null);
        }
    }

    public void devide(View view) {
        if(values == null){
            values.setText("");
        }
        else {
            valOne = Float.parseFloat(values.getText() + "");
            mDivision = true;
            values.setText(null);
        }
    }

    public void logrithm(View view) {
        if(values == null){
            values.setText("");
        }
        else {
            valOne = Float.parseFloat(values.getText() + "");
            values.setText(null);
            Result.setText(Math.log10(valOne)+"");
        }
    }

    public void clear(View view) {
        Result.setText("");
        values.setText("");
    }

    public void Calculate(View view) {
        valTwo = Float.parseFloat(values.getText() + "");
        if (mAddition == true) {
            values.setText(valOne + "+" + valTwo);
            Result.setText(valOne + valTwo + "");
            mAddition = false;
        }
        if (mSubtract == true) {
            values.setText(valOne + "-" + valTwo);
            Result.setText(valOne - valTwo + "");
            mSubtract = false;
        }
        if (mMultiplication == true) {
            values.setText(valOne + "*" + valTwo);
            Result.setText(valOne * valTwo + "");
            mMultiplication = false;
        }
        if (mDivision == true) {
            values.setText(valOne + "/" + valTwo);
            Result.setText(valOne / valTwo + "");
            mDivision = false;
        }
    }

    public void ChangeColor(View view) {
        RelativeLayout r1 = findViewById(R.id.Calculator);
        r1.setBackgroundColor(Color.CYAN);
    }
}
