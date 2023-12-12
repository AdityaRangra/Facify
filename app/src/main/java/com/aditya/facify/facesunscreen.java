package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class facesunscreen extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton19;
    ImageButton imageButton22;
    ImageButton imageButton24;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facesunscreen);

        imageButton = findViewById(R.id.imageButton37);
        imageButton7 = findViewById(R.id.imageButton42);
        imageButton8 = findViewById(R.id.imageButton38);
        imageButton16 = findViewById(R.id.imageButton237);
        imageButton17 = findViewById(R.id.imageButton247);
        imageButton19 = findViewById(R.id.imageButton267);
        imageButton22 = findViewById(R.id.imageButton312);
        imageButton24 = findViewById(R.id.imageButton322);
        imageButton25 = findViewById(R.id.imageButton344);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/8jtiI4");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/9EIi12");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/RNsro5");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/KtUEBQ");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/WIVtTc");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/4D2tZR");
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/fYEoqp");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/kn3ARj");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/ZU9yY7");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}

