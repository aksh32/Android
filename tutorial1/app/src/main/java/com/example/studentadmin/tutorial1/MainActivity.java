package com.example.studentadmin.tutorial1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    double no1 , no2;
    EditText et1,et2;
    TextView res ;
    Button add,sub,mul,div,log,clear,calculate,chngclr;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText2);
        et2 = findViewById(R.id.editText3);

        res = findViewById(R.id.textView2);

        add = findViewById(R.id.button13);
        sub = findViewById(R.id.button11);
        mul = findViewById(R.id.button14);
        div = findViewById(R.id.button10);
        log = findViewById(R.id.button12);
        clear = findViewById(R.id.button9);
        calculate = findViewById(R.id.button16);
        chngclr = findViewById(R.id.button15);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 =Double.parseDouble(et1.getText().toString());
                no2 =Double.parseDouble(et2.getText().toString());

                double result =  no1+no2;

                res.setText("Addition = "+result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 =Double.parseDouble(et1.getText().toString());
                no2 =Double.parseDouble(et2.getText().toString());

                double result =  no1-no2;

                res.setText("Subtraction = "+result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 =Double.parseDouble(et1.getText().toString());
                no2 =Double.parseDouble(et2.getText().toString());

                double result =  no1*no2;

                res.setText("Multiplication = "+result);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 =Double.parseDouble(et1.getText().toString());
                no2 =Double.parseDouble(et2.getText().toString());

                double result =  no1/no2;

                res.setText("Division = "+result);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 =Double.parseDouble(et1.getText().toString());
 //               no2 =Integer.parseInt(et2.getText().toString());

                double result =  java.lang.Math.log(no1);

                res.setText("Addition = "+result);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                et1.setText("");
                et2.setText("");
                res.setText("");
            }
        });

        chngclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layout = findViewById(R.id.layout);
                Random random = new Random();
                int color = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                layout.setBackgroundColor(color);



            }
        });

    }
}
