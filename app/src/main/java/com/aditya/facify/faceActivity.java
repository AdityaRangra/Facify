package com.aditya.facify;

import static com.example.facify.R.id.button14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.facify.R;

public class faceActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);

        Button button11 = findViewById(R.id.button);
        Button button12 = findViewById(R.id.button2);
        Button button13= findViewById(R.id.button12);
        Button button14 = findViewById(R.id.button13);
        Button button16 = findViewById(R.id.button15);
        Button button17 = findViewById(R.id.button20);
        Button button18 = findViewById(R.id.button21);
        Button button19 = findViewById(R.id.button22);
        Button button20 = findViewById(R.id.button23);
        Button button21 = findViewById(R.id.button14);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        {
            switch (view.getId()) {
                case R.id.button:
                    Intent a = new Intent(faceActivity.this, facewash.class);
                    startActivity(a);
                    break;

                case R.id.button2:
                    Intent b = new Intent(faceActivity.this, facescrub.class);
                    startActivity(b);
                    break;

                case R.id.button12:
                    Intent c = new Intent(faceActivity.this, faceserum.class);
                    startActivity(c);
                    break;

                case R.id.button13:
                    Intent i = new Intent(faceActivity.this, facecream.class);
                    startActivity(i);
                    break;


                case R.id.button15:
                    Intent l = new Intent(faceActivity.this, facemoisture.class);
                    startActivity(l);
                    break;

                case R.id.button20:
                    Intent g = new Intent(faceActivity.this,facesunscreen.class);
                    startActivity(g);
                    break;

                case R.id.button21:
                    Intent h = new Intent(faceActivity.this, facegel.class);
                    startActivity(h);
                    break;

                case R.id.button22:
                    Intent m = new Intent(faceActivity.this, facelipbalm.class);
                    startActivity(m);
                    break;

                case R.id.button23:
                    Intent j = new Intent(faceActivity.this, faceeyecare.class);
                    startActivity(j);
                    break;

                case button14:
                    Intent k = new Intent(faceActivity.this, facemask.class);
                    startActivity(k);
                    break;

            }
}}}

