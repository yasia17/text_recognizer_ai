package com.example.text_recognizer_ai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class RightText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_text);


        String recognizedText = getIntent().getStringExtra("recognizedText");
    }
}