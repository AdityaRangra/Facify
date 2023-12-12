package com.aditya.facify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.facify.R;

public class ShaveActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shave);

        Button button11 = findViewById(R.id.button58);
        Button button12 = findViewById(R.id.button59);
        Button button13= findViewById(R.id.button60);
        Button button14 = findViewById(R.id.button61);
        Button button15 = findViewById(R.id.button62);
        Button button16 = findViewById(R.id.button63);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button58:
                Intent a = new Intent(ShaveActivity.this, shavegel.class);
                startActivity(a);
                break;

            case R.id.button59:
                Intent b = new Intent(ShaveActivity.this, shavecream.class);
                startActivity(b);
                break;

            case R.id.button60:
                Intent c = new Intent(ShaveActivity.this, shaviefoam.class);
                startActivity(c);
                break;

            case R.id.button61:
                Intent d = new Intent(ShaveActivity.this, aftershave.class);
                startActivity(d);
                break;

            case R.id.button62:
                Intent e = new Intent(ShaveActivity.this, shavepost.class);
                startActivity(e);
                break;

            case R.id.button63:
                Intent f = new Intent(ShaveActivity.this, shavetrimmer.class);
                startActivity(f);
                break;

    }
}}