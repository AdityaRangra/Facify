package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class hairmask extends AppCompatActivity {

    ImageButton imageButton3;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton9;
    ImageButton imageButton10;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton16;
    ImageButton imageButton17;
    ImageButton imageButton19;
    ImageButton imageButton21;
    ImageButton imageButton22;
    ImageButton imageButton24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hairmask);


        imageButton3 = findViewById(R.id.imageButton118);
        imageButton6 = findViewById(R.id.imageButton120);
        imageButton7 = findViewById(R.id.imageButton121);
        imageButton9 = findViewById(R.id.imageButton68);
        imageButton10 = findViewById(R.id.imageButton89);
        imageButton12 = findViewById(R.id.imageButton148);
        imageButton13 = findViewById(R.id.imageButton174);
        imageButton16 = findViewById(R.id.imageButton218);
        imageButton17 = findViewById(R.id.imageButton243);
        imageButton19 = findViewById(R.id.imageButton277);
        imageButton21 = findViewById(R.id.imageButton305);
        imageButton22 = findViewById(R.id.imageButton315);
        imageButton24 = findViewById(R.id.imageButton331);


        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/rW28pE");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/w9ieJh");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/HT8q1F");
            }
        });
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/REWpXu");
            }
        });
        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/7lL2Hu");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/8bBjZV");
            }
        });

        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fkhadiessentials.com%2Fcollections%2Fhair");
            }
        });
        imageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/oT6pSh");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/PmHKWh");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/atMG6O");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/D31vtg");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/iKcqG1");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Wu5EDK");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}