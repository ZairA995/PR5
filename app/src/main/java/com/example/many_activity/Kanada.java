package com.example.many_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Kanada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanada);
        getSupportActionBar().hide();
    }
}