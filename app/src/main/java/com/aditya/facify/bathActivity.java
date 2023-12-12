package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.facify.R;

public class bathActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bath);

        Button button11 = findViewById(R.id.button16);
        Button button12 = findViewById(R.id.button18);
        Button button13= findViewById(R.id.button19);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button16:
                Intent a = new Intent(bathActivity.this, bathwash.class);
                startActivity(a);
                break;

            case R.id.button18:
                Intent b = new Intent(bathActivity.this, bathsoap.class);
                startActivity(b);
                break;

            case R.id.button19:
                Intent c = new Intent(bathActivity.this, bathscrub.class);
                startActivity(c);
                break;

    }
}}