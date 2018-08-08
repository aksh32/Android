package com.example.studentadmin.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    GridView g;
    Integer[] days = {1,2,3,4,5,6,7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        g = findViewById(R.id.GV);
        ArrayAdapter<Integer>adapter = new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_1, days);
        g.setAdapter(adapter);
        g.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView temp = (TextView)view;
        Toast.makeText(this,temp.getText(),Toast.LENGTH_SHORT).show();
    }
}
