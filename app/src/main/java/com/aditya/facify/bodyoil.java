package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class bodyoil extends AppCompatActivity {


    ImageButton imageButton7;
    ImageButton imageButton12;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton18;
    ImageButton imageButton20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyoil);


        imageButton7 = findViewById(R.id.imageButton85);
        imageButton12 = findViewById(R.id.imageButton165);
        imageButton15 = findViewById(R.id.imageButton201);
        imageButton16 = findViewById(R.id.imageButton217);
        imageButton18 = findViewById(R.id.imageButton258);
        imageButton20 = findViewById(R.id.imageButton288);

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/v3Vomi");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/LQz1HD");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Pa4QNO");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/x6PMiA");
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/2t94SD");
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/qKQdZN");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}