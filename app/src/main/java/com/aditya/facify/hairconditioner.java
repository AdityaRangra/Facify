package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class hairconditioner extends AppCompatActivity {

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
        setContentView(R.layout.activity_hairconditioner);

        imageButton = findViewById(R.id.imageButton110);
        imageButton3 = findViewById(R.id.imageButton112);
        imageButton5 = findViewById(R.id.imageButton113);
        imageButton6 = findViewById(R.id.imageButton114);
        imageButton7 = findViewById(R.id.imageButton115);
        imageButton10 = findViewById(R.id.imageButton90);
        imageButton11 = findViewById(R.id.imageButton119);
        imageButton12 = findViewById(R.id.imageButton153);
        imageButton13 = findViewById(R.id.imageButton173);
        imageButton14= findViewById(R.id.imageButton195);
        imageButton15= findViewById(R.id.imageButton209);
        imageButton16 = findViewById(R.id.imageButton220);
        imageButton17 = findViewById(R.id.imageButton240);
        imageButton19 = findViewById(R.id.imageButton276);
        imageButton20 = findViewById(R.id.imageButton294);
        imageButton21 = findViewById(R.id.imageButton306);
        imageButton22 = findViewById(R.id.imageButton317);
        imageButton24 = findViewById(R.id.imageButton329);
        imageButton25 = findViewById(R.id.imageButton346);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/TmBtAM");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/UPIfca");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/LwPOic");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/NyvPIo");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/prhSCe");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/RLblew");
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/GH5lMN");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/hra563");
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/OGdNe7");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/zAmXcq");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Cr4fVu");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/hzmsKO");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/7TJQcf");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/yo2zN9");
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/3GDJ1O");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Db165r");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/tgSEf5");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/6047WB");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/80Ki7J");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}