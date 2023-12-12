package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class facelipbalm extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton5;
    ImageButton imageButton7;
    ImageButton imageButton8;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton15;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton19;
    ImageButton imageButton20;
    ImageButton imageButton24;
    ImageButton imageButton25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facelipbalm);

        imageButton = findViewById(R.id.imageButton49);
        imageButton5 = findViewById(R.id.imageButton52);
        imageButton7 = findViewById(R.id.imageButton54);
        imageButton8 = findViewById(R.id.imageButton50);
        imageButton12 = findViewById(R.id.imageButton143);
        imageButton13 = findViewById(R.id.imageButton177);
        imageButton14 = findViewById(R.id.imageButton191);
        imageButton15 = findViewById(R.id.imageButton207);
        imageButton16 = findViewById(R.id.imageButton224);
        imageButton17 = findViewById(R.id.imageButton238);
        imageButton19 = findViewById(R.id.imageButton268);
        imageButton20 = findViewById(R.id.imageButton291);
        imageButton24 = findViewById(R.id.imageButton325);
        imageButton25 = findViewById(R.id.imageButton342);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/2zlbVr");
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/0UV2wA");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/sBRKEW");
            }
        });
        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/hMvDRG");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.kamaayurveda.com%2Fskin%2Fby-category%2Flip-care.html");
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/RhrQGT");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/dBvQ8O");
            }
        });
        imageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/P5Cq1A");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/fTkNdu");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.myglamm.com%2Fbuy%2Fmakeup%2Flips%2Flip-balm");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/zM0dRQ");
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/sQdEFJ");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/VOF9r8");
            }
        });
        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/hMOVzX");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
