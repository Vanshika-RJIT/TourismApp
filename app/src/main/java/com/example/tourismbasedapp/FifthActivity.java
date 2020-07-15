package com.example.tourismbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }
    public void click_btn3(View view) {
        Intent i=new Intent(FifthActivity.this,IndoreActivity.class);
        startActivity(i);
    }
}