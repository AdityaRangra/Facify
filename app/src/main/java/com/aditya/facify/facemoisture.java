package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class facemoisture extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton3;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton12;
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
        setContentView(R.layout.activity_facemoisture);

        imageButton = findViewById(R.id.imageButton31);
        imageButton3 = findViewById(R.id.imageButton33);
        imageButton5 = findViewById(R.id.imageButton34);
        imageButton6 = findViewById(R.id.imageButton35);
        imageButton7 = findViewById(R.id.imageButton36);
        imageButton8 = findViewById(R.id.imageButton32);
        imageButton12 = findViewById(R.id.imageButton141);
        imageButton14 = findViewById(R.id.imageButton190);
        imageButton15 = findViewById(R.id.imageButton203);
        imageButton16 = findViewById(R.id.imageButton235);
        imageButton17 = findViewById(R.id.imageButton251);
        imageButton19 = findViewById(R.id.imageButton264);
        imageButton20 = findViewById(R.id.imageButton292);
        imageButton21 = findViewById(R.id.imageButton300);
        imageButton22 = findViewById(R.id.imageButton309);
        imageButton24 = findViewById(R.id.imageButton321);
        imageButton25 = findViewById(R.id.imageButton340);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/NpjBGx");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/GR0bQD");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/HGEcgx");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/zp5v4t");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/HSmJKs");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/zUk6YC");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/DNcRuS");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/oYSvEt");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/IPUlpB");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/vwYFDn");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.facescanada.com%2Fcollections%2Fmoisturizers");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/18MQE0");
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/jQG2W8");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/EqcOng");
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/eoQ8tD");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/jWFzaw");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fjovees.com%2Fskin-care%2Fby-category%2Fcream-and-moisturizers.html");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
