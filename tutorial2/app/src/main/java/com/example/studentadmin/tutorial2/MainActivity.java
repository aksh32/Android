package com.example.studentadmin.tutorial2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //RadioGroup g1,g2;
    RadioButton r1,r2,r3,r4;
    private ImageView mImageView;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //g1 = findViewById(R.id.rg2);

        r1= findViewById(R.id.radioButton2);
        r2= findViewById(R.id.radioButton);
        r3 = findViewById(R.id.radioButton4);
        r4 = findViewById(R.id.radioButton3);
        mImageView = (ImageView)findViewById(R.id.imageView);
        b1 = findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=0,n2 = 0;

                if(r1.isChecked())
                    n1 = 0;

                if(r2.isChecked())
                    n1 = 1;

                if(r3.isChecked())
                    n2 = 0;

                if(r4.isChecked())
                    n2 = 1;

                if(n1 == 0 && n2 == 0)
                    mImageView.setImageResource(R.drawable.image1);
                else if(n1 == 0 && n2 == 1)
                    mImageView.setImageResource(R.drawable.image2);
                else if(n1 == 1 && n2 == 0)
                    mImageView.setImageResource(R.drawable.image3);
                else if(n1 == 1 && n2 == 1)
                    mImageView.setImageResource(R.drawable.image4);
            }
        });



    }
}
