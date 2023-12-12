package com.aditya.facify;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.facify.R;
import com.example.facify.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button2 = findViewById(R.id.button3);
        Button button3 = findViewById(R.id.button4);
        Button button4 = findViewById(R.id.button5);
        Button button5 = findViewById(R.id.button6);
        Button button8 = findViewById(R.id.button9);
        Button button9 = findViewById(R.id.button10);
        Button button10 = findViewById(R.id.button11);


        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);


    }

        private void gotoUrl(String s) {
            Uri uri = Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        }




    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button3:
                Intent a = new Intent(MainActivity.this, bathActivity.class);
                startActivity(a);
                break;

            case R.id.button4:
                Intent b = new Intent(MainActivity.this, bodyActivity2.class);
                startActivity(b);
                break;

            case R.id.button5:
                Intent c = new Intent(MainActivity.this, faceActivity.class);
                startActivity(c);
                break;
            case R.id.button6:
                Intent d = new Intent(MainActivity.this, hairActivity.class);
                startActivity(d);
                break;

            case R.id.button9:
                Intent g = new Intent(MainActivity.this, Beard_Activity.class);
                startActivity(g);
                break;

            case R.id.button10:
                Intent h = new Intent(MainActivity.this, ShaveActivity.class);
                startActivity(h);
                break;


            case R.id.button11:
                Intent i = new Intent(MainActivity.this, FragranceActivity.class);
                startActivity(i);
                break;
        }
    }
}








