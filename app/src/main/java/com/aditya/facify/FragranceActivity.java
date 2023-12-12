package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.facify.R;

public class FragranceActivity extends AppCompatActivity {

    ImageButton imageButton99;
    ImageButton imageButton98;
    ImageButton imageButton97;
    ImageButton imageButton96;
    ImageButton imageButton95;
    ImageButton imageButton94;
    ImageButton imageButton93;
    ImageButton imageButton92;
    ImageButton imageButton91;
    ImageButton imageButton90;
    ImageButton imageButton89;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragrance);

        imageButton99 = findViewById(R.id.imageButton22);
        imageButton98 = findViewById(R.id.imageButton24);
        imageButton97 = findViewById(R.id.imageButton40);
        imageButton96 = findViewById(R.id.imageButton44);
        imageButton95 = findViewById(R.id.imageButton2);
        imageButton94 = findViewById(R.id.imageButton51);
        imageButton93 = findViewById(R.id.imageButton116);
        imageButton92 = findViewById(R.id.imageButton196);
        imageButton91 = findViewById(R.id.imageButton211);
        imageButton90 = findViewById(R.id.imageButton225);
        imageButton89 = findViewById(R.id.imageButton283);

        imageButton99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/7dl03T");
            }
        });
        imageButton98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/jcleSF");
            }
        });
        imageButton97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/eLndjX");
            }
        });
        imageButton96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Z3UbHy");
            }
        });
        imageButton95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/e83IwT");
            }
        });
        imageButton94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/MZ3nYU");
            }
        });
        imageButton93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/paN0wk");
            }
        });
        imageButton92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/hRlQvW");
            }
        });
        imageButton91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/w1oGSe");
            }
        });
        imageButton90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/cVQLsx");
            }
        });
        imageButton89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/6oXKkz");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
