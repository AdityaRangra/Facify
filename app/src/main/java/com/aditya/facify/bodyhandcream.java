package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class bodyhandcream extends AppCompatActivity {


    ImageButton imageButton6;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton15;
    ImageButton imageButton18;
    ImageButton imageButton26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyhandcream);

        imageButton6 = findViewById(R.id.imageButton46);
        imageButton12 = findViewById(R.id.imageButton159);
        imageButton13 = findViewById(R.id.imageButton185);
        imageButton15 = findViewById(R.id.imageButton202);
        imageButton18 = findViewById(R.id.imageButton259);
        imageButton26 = findViewById(R.id.imageButton351);


        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/brxOIR");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/L3a6DG");
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/qlo76j");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/6Lrnm3");
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/z2hiSl");
            }
        });
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fjovees.com%2Fbody-care%2Fby-category%2Fhand-body-lotion.html");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}