package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.facify.R;

public class bodyActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body2);


        Button button11 = findViewById(R.id.button24);
        Button button12 = findViewById(R.id.button25);
        Button button14 = findViewById(R.id.button27);
        Button button16 = findViewById(R.id.button29);
        Button button17 = findViewById(R.id.button30);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button14.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button24:
                Intent a = new Intent(bodyActivity2.this, bodylotion.class);
                startActivity(a);
                break;

            case R.id.button25:
                Intent b = new Intent(bodyActivity2.this, bodyhandcream.class);
                startActivity(b);
                break;


            case R.id.button27:
                Intent d = new Intent(bodyActivity2.this, bodyoil.class);
                startActivity(d);
                break;

            case R.id.button29:
                Intent f = new Intent(bodyActivity2.this, bodyhairremoval.class);
                startActivity(f);
                break;

            case R.id.button30:
                Intent g = new Intent(bodyActivity2.this,bodytattocare.class);
                startActivity(g);
                break;

        }
    }}