package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class hairshampoo extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton3;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton19;
    ImageButton imageButton20;
    ImageButton imageButton21;
    ImageButton imageButton22;
    ImageButton imageButton24;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairshampoo);

        imageButton = findViewById(R.id.imageButton104);
        imageButton3 = findViewById(R.id.imageButton106);
        imageButton5 = findViewById(R.id.imageButton107);
        imageButton6 = findViewById(R.id.imageButton108);
        imageButton7 = findViewById(R.id.imageButton109);
        imageButton10 = findViewById(R.id.imageButton91);
        imageButton11 = findViewById(R.id.imageButton128);
        imageButton12 = findViewById(R.id.imageButton156);
        imageButton13 = findViewById(R.id.imageButton175);
        imageButton14= findViewById(R.id.imageButton194);
        imageButton15= findViewById(R.id.imageButton208);
        imageButton16 = findViewById(R.id.imageButton221);
        imageButton17 = findViewById(R.id.imageButton244);
        imageButton19 = findViewById(R.id.imageButton275);
        imageButton20 = findViewById(R.id.imageButton293);
        imageButton21 = findViewById(R.id.imageButton302);
        imageButton22 = findViewById(R.id.imageButton314);
        imageButton24 = findViewById(R.id.imageButton328);
        imageButton25 = findViewById(R.id.imageButton345);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.themancompany.com%2Fcollections%2Fshampoo");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/K9Mzns");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/BLgsPr");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/shItLe");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/HrjR0Y");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/mevFCO");
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/JWUcN0");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/jtTeEG");
            }
        });

        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/pIMnW3");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/olMKve");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/7Q086s");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/opR8KC");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/B3fQFw");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/c2AZNy");
            }
        });



        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/7M39nf");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/3Rz6Np");
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/dAi9Wk");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Rehjc7");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/3ipB8k");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}