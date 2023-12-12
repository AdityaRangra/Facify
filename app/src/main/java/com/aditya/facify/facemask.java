package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;
public class facemask extends AppCompatActivity  {

    ImageButton imageButton;
    ImageButton imageButton7;
    ImageButton imageButton11;
    ImageButton imageButton12;
    ImageButton imageButton13;
    ImageButton imageButton14;
    ImageButton imageButton17;
    ImageButton imageButton18;
    ImageButton imageButton19;
    ImageButton imageButton20;
    ImageButton imageButton21;
    ImageButton imageButton22;
    ImageButton imageButton24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facemask);

        imageButton = findViewById(R.id.imageButton20);
        imageButton7 = findViewById(R.id.imageButton25);
        imageButton11 = findViewById(R.id.imageButton132);
        imageButton12 = findViewById(R.id.imageButton139);
        imageButton13 = findViewById(R.id.imageButton170);
        imageButton14 = findViewById(R.id.imageButton193);
        imageButton17 = findViewById(R.id.imageButton246);
        imageButton18 = findViewById(R.id.imageButton249);
        imageButton19 = findViewById(R.id.imageButton271);
        imageButton20 = findViewById(R.id.imageButton285);
        imageButton21 = findViewById(R.id.imageButton297);
        imageButton22 = findViewById(R.id.imageButton313);
        imageButton24 = findViewById(R.id.imageButton323);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/uBJAtb");
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/9uTHSo");
            }
        });
        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/k3WwsY");
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/250R43");
            }
        });
        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/JTsLHi");
            }
        });
        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Y0rz1p");
            }
        });
        imageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/8omh9I");
            }
        });
        imageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Y89P7e");
            }
        });
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/KGR6zT");
            }
        });
        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/8mjdJV");
            }
        });
        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/G2LDzI");
            }
        });
        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/atifnJ");
            }
        });
        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/y48crB");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
