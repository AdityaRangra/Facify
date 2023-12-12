package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class bathscrub extends AppCompatActivity {



    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathscrub);



        imageButton6 = findViewById(R.id.imageButton77);
        imageButton7 = findViewById(R.id.imageButton78);
        imageButton8 = findViewById(R.id.imageButton14);
        imageButton9 = findViewById(R.id.imageButton75);
        imageButton10 = findViewById(R.id.imageButton87);
        imageButton12 = findViewById(R.id.imageButton161);
        imageButton13 = findViewById(R.id.imageButton184);
        imageButton16 = findViewById(R.id.imageButton213);
        imageButton17 = findViewById(R.id.imageButton256);
        imageButton24 = findViewById(R.id.imageButton336);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/jNEScg");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/GRtPZF");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/NAlsty");
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/rcsRTw");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.ustraa.com%2Fall-products%2Fc%3Futm_campaign%3Doptimise%26utm_source%3Daffiliate%26utm_medium%3Dcpa%26utm_content%3Doptimise_355300_adi649603859_63f488914aa2e4879_1993%23Face%20%26%20Body");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/sBXe3P");
            }
        });

        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/HtKUA8");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/mlJGAO");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/9k7Mrc");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/WPmCz5");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}

