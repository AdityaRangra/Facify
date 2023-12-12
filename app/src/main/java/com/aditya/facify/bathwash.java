package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class bathwash extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton5;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton10;
    ImageButton imageButton11;
    ImageButton imageButton12;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton24;
    ImageButton imageButton26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathwash);

        imageButton = findViewById(R.id.imageButton63);
        imageButton2 = findViewById(R.id.imageButton64);
        imageButton3 = findViewById(R.id.imageButton65);
        imageButton5 = findViewById(R.id.imageButton66);
        imageButton6 = findViewById(R.id.imageButton67);
        imageButton7 = findViewById(R.id.imageButton8);
        imageButton10 = findViewById(R.id.imageButton80);
        imageButton11 = findViewById(R.id.imageButton136);
        imageButton12 = findViewById(R.id.imageButton183);
        imageButton15 = findViewById(R.id.imageButton199);
        imageButton16 = findViewById(R.id.imageButton214);
        imageButton17 = findViewById(R.id.imageButton253);
        imageButton24 = findViewById(R.id.imageButton335);
        imageButton26 = findViewById(R.id.imageButton352);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/OeXqAV");
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/moU2LF");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            gotoUrl("https://inr.deals/d2gTuF");
        }
    });
        imageButton5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            gotoUrl("https://inr.deals/WLQ6B1");
        }
    });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/P8aBIF");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fbellavitaorganic.com%2Fcollections%2Fbody-wash");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/s8Na73");
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Z6wbAS");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/bV5cwv");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/UEHA7s");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/bX4KTO");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/CZSgh2");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/aVknZ0");
            }
        });
        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/nFBS8O");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}

