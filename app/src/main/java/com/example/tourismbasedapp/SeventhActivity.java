package com.example.tourismbasedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

    }
    public void click_btn5(View view) {
        Intent i=new Intent(SeventhActivity.this,KolkataActivity.class);
        startActivity(i);
    }
}