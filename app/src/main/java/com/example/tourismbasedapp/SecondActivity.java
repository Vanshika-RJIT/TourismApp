package com.example.tourismbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView l;
    String str[]={"Bhopal","Gwalior","Indore","Mumbai","Kolkata"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       l=findViewById(R.id.text1);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(SecondActivity.this,android.R.layout.simple_selectable_list_item,str);
        l.setAdapter(ad);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent i= new Intent(SecondActivity.this,ThirdActivity.class);
                    startActivity(i);
                }else  if(position==1)
                {
                    Intent i= new Intent(SecondActivity.this,FourthActivity.class);
                    startActivity(i);
                } else if(position==2)
                {
                    Intent i= new Intent(SecondActivity.this,FifthActivity.class);
                    startActivity(i);
                } else if(position==3)
                {
                    Intent i= new Intent(SecondActivity.this,SixthActivity.class);
                    startActivity(i);
                } else
                {
                    Intent i= new Intent(SecondActivity.this,SeventhActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}