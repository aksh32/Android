package com.example.programmersadda.textindentationprog3;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static Button btn_gen;
    private  static RadioGroup rg_style, rg_gravity;
    private static TextView textDisplay;
    private  static EditText eTxt;
    private static RadioButton rb_style, rb_gravity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();
    }

    public void onClickButtonListener(){
        btn_gen = (Button) findViewById(R.id.btn_gen);
        textDisplay = (TextView) findViewById(R.id.textDisplay);
        eTxt = (EditText) findViewById(R.id.eTxt);
        rg_style = (RadioGroup) findViewById(R.id.rg_style);
        rg_gravity = (RadioGroup) findViewById(R.id.rg_gravity);

        btn_gen.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("WrongConstant")
                    @Override
                    public void onClick(View view) {
                        int rbStyleId = rg_style.getCheckedRadioButtonId();
                        int rbGravityId = rg_gravity.getCheckedRadioButtonId();
                        String msg = eTxt.getText().toString();
                        rb_style = (RadioButton) findViewById(rbStyleId);
                        rb_gravity = (RadioButton) findViewById(rbGravityId);

                        if(rb_style.getId() == R.id.rb_normal)
                        {
                            switch (rb_gravity.getId())
                            {
                                case R.id.rb_center:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                                    break;
                                case R.id.rb_right:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                                    break;
                                default:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                                    break;
                            }
                            textDisplay.setText(msg);
                            textDisplay.setTypeface(null,Typeface.NORMAL);
                        }
                        else if(rb_style.getId() == R.id.rb_italics)
                        {

                            switch (rb_gravity.getId())
                            {
                                case R.id.rb_center:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                                    break;
                                case R.id.rb_right:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                                    break;
                                default:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                                    break;
                            }
                            textDisplay.setText(msg);
                            textDisplay.setTypeface(null,Typeface.ITALIC);

                        }
                        else if(rb_style.getId() == R.id.rb_bold)
                        {
                            switch (rb_gravity.getId())
                            {
                                case R.id.rb_center:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                                    break;
                                case R.id.rb_right:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                                    break;
                                default:
                                    textDisplay.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                                    break;
                            }
                            textDisplay.setText(msg);
                            textDisplay.setTypeface(null,Typeface.BOLD);
                        }

                    }
                }
        );

    }
}
