package com.aditya.facify;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.facify.R;

    public class shavepost extends AppCompatActivity {


    ImageButton imageButton5;
    ImageButton imageButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shavepost);

        imageButton5 = findViewById(R.id.imageButton296);
        imageButton6 = findViewById(R.id.imageButton298);




        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/track?id=adi649603859&src=chrome-extension&url=https%3A%2F%2Fwww.themancompany.com%2Fproducts%2Fpost-shave-lotion-jojoba-mint");
            }
        });
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://inr.deals/Ku7JNd");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
