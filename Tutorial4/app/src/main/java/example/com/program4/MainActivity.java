package example.com.program4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        cb1 = (CheckBox) findViewById(R.id.cbx1);
        cb2 = (CheckBox) findViewById(R.id.cbx2);
        cb3 = (CheckBox) findViewById(R.id.cbx3);
        cb4 = (CheckBox) findViewById(R.id.cbx4);
        cb5 = (CheckBox) findViewById(R.id.cbx5);


    }

    public void checkit(View view){
        String msg="";
        if(cb1.isChecked()){
            msg = cb1.getText().toString();
        }
        if(cb2.isChecked()){
            msg+=cb2.getText().toString();
        }
        if(cb3.isChecked()){
            msg+=cb3.getText().toString();
        }
        if(cb4.isChecked()){
            msg+=cb4.getText().toString();
        }
        if(cb5.isChecked()){
            msg+=cb5.getText().toString();
        }

        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();


    }
}
