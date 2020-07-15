package com.example.tourismbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void click_btn2(View view) {
        Intent i=new Intent(FourthActivity.this,GwaliorActivity.class);
        startActivity(i);
    }

}