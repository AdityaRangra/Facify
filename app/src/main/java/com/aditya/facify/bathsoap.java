package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class bathsoap extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton3;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton24;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathsoap);

        imageButton = findViewById(R.id.imageButton61);
        imageButton3 = findViewById(R.id.imageButton69);
        imageButton5 = findViewById(R.id.imageButton70);
        imageButton6 = findViewById(R.id.imageButton71);
        imageButton7 = findViewById(R.id.imageButton72);
        imageButton9 = findViewById(R.id.imageButton76);
        imageButton10 = findViewById(R.id.imageButton88);
        imageButton12 = findViewById(R.id.imageButton160);
        imageButton13 = findViewById(R.id.imageButton180);
        imageButton14 = findViewById(R.id.imageButton182);
        imageButton15 = findViewById(R.id.imageButton197);
        imageButton16 = findViewById(R.id.imageButton212);
        imageButton17 = findViewById(R.id.imageButton255);
        imageButton24 = findViewById(R.id.imageButton334);
        imageButton25 = findViewById(R.id.imageButton353);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Fi79Qj");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/C9QpMs");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/1fmd8n");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/wqHLrK");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/GiFuVw");
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/iMpnz6");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/1twJyW");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/id0B4S");
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/G0FZ2h");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Z6rA7V");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/F9h6Kc");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/jdk4Iv");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Yctiek");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.vilvahstore.com%2Fcollections%2Fhandmade-soap");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/KPETOe");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
