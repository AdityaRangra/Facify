package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class facescrub extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton3;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton10;
    ImageButton imageButton12;
    ImageButton imageButton14;
    ImageButton imageButton19;
    ImageButton imageButton20;
    ImageButton imageButton22;
    ImageButton imageButton24;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facescrub);

        imageButton = findViewById(R.id.imageButton4);
        imageButton3 = findViewById(R.id.imageButton9);
        imageButton5 = findViewById(R.id.imageButton10);
        imageButton6 = findViewById(R.id.imageButton11);
        imageButton7 = findViewById(R.id.imageButton12);
        imageButton8 = findViewById(R.id.imageButton29);
        imageButton10 = findViewById(R.id.imageButton84);
        imageButton12 = findViewById(R.id.imageButton144);
        imageButton14 = findViewById(R.id.imageButton229);
        imageButton19 = findViewById(R.id.imageButton261);
        imageButton20 = findViewById(R.id.imageButton289);
        imageButton22 = findViewById(R.id.imageButton308);
        imageButton24 = findViewById(R.id.imageButton324);
        imageButton25 = findViewById(R.id.imageButton337);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/8Poh94");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/V5AI6j");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/FuIq4h");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/6IHdPa");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/gD0V6M");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/NFIAnp");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Ioc7WG");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/FgZs9z");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/q9Afxp");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/eVPTSZ");
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Aqb9N7");
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/bjuLA1");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/3DoKnE");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/47dqwG");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}


