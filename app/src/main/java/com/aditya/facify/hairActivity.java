package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.facify.R;

public class hairActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        Button button11 = findViewById(R.id.button28);
        Button button12 = findViewById(R.id.button31);
        Button button13= findViewById(R.id.button32);
        Button button14 = findViewById(R.id.button33);
        Button button15 = findViewById(R.id.button34);
        Button button17 = findViewById(R.id.button36);
        Button button18 = findViewById(R.id.button37);
        Button button19 = findViewById(R.id.button38);
        Button button20 = findViewById(R.id.button39);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button28:
                Intent a = new Intent(hairActivity.this, hairoil.class);
                startActivity(a);
                break;

            case R.id.button31:
                Intent b = new Intent(hairActivity.this, hairshampoo.class);
                startActivity(b);
                break;

            case R.id.button32:
                Intent c = new Intent(hairActivity.this, hairconditioner.class);
                startActivity(c);
                break;

            case R.id.button33:
                Intent d = new Intent(hairActivity.this, hairmask.class);
                startActivity(d);
                break;

            case R.id.button34:
                Intent e = new Intent(hairActivity.this, hairserum.class);
                startActivity(e);
                break;


            case R.id.button36:
                Intent g = new Intent(hairActivity.this,hairspray.class);
                startActivity(g);
                break;

            case R.id.button37:
                Intent h = new Intent(hairActivity.this, hairscalpscrub.class);
                startActivity(h);
                break;

            case R.id.button38:
                Intent i = new Intent(hairActivity.this, hairgrowthtonic.class);
                startActivity(i);
                break;

            case R.id.button39:
                Intent j = new Intent(hairActivity.this, hairwax.class);
                startActivity(j);
                break;

            default:

    }
}}