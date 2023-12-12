package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class facecream extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton3;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton12;
    ImageButton imageButton14;
    ImageButton imageButton18;
    ImageButton imageButton19;
    ImageButton imageButton22;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facecream);

        imageButton = findViewById(R.id.imageButton19);
        imageButton3 = findViewById(R.id.imageButton21);
        imageButton6 = findViewById(R.id.imageButton23);
        imageButton7 = findViewById(R.id.imageButton26);
        imageButton9 = findViewById(R.id.imageButton59);
        imageButton10 = findViewById(R.id.imageButton82);
        imageButton12 = findViewById(R.id.imageButton138);
        imageButton14 = findViewById(R.id.imageButton234);
        imageButton18 = findViewById(R.id.imageButton252);
        imageButton19 = findViewById(R.id.imageButton262);
        imageButton22 = findViewById(R.id.imageButton311);
        imageButton25 = findViewById(R.id.imageButton339);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.themancompany.com%2Fcollections%2Fface-cream");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fbombayshavingcompany.com%2Fpages%2Fskin-category");
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fmamaearth.in%2Fproduct-category%2Fface-cream");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/ocE9ad");
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/I5WRmP");
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
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.kamaayurveda.com%2Fskin%2Fby-category%2Fcreams-moisturizers.html");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/mpql4P");
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/nXh0mq");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/TbkgBM");
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/K1wPI8");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/VoEB8T");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}