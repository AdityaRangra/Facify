package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class faceeyecare extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton5;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton11;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton19;
    ImageButton imageButton24;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faceeyecare);

        imageButton = findViewById(R.id.imageButton55);
        imageButton5 = findViewById(R.id.imageButton58);
        imageButton7 = findViewById(R.id.imageButton60);
        imageButton8 = findViewById(R.id.imageButton41);
        imageButton11 = findViewById(R.id.imageButton131);
        imageButton14 = findViewById(R.id.imageButton192);
        imageButton15 = findViewById(R.id.imageButton204);
        imageButton16 = findViewById(R.id.imageButton239);
        imageButton19 = findViewById(R.id.imageButton270);
        imageButton24 = findViewById(R.id.imageButton326);
        imageButton25 = findViewById(R.id.imageButton343);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/tMwBaT");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/5xntEr");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/SwDgyd");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/APpoMT");
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/VQGSD9");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/71GwLM");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/ZyEiAT");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/yPTzU2");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/nBGvAO");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.vilvahstore.com%2Fcollections%2Feye-care");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/3vZaPb");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
