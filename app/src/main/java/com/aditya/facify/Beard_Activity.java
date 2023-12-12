package com.aditya.facify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.facify.R;

public class Beard_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beard);
        Button button11 = findViewById(R.id.button17);
        Button button12 = findViewById(R.id.button52);
        Button button13= findViewById(R.id.button53);
        Button button14 = findViewById(R.id.button54);
        Button button15 = findViewById(R.id.button55);
        Button button16 = findViewById(R.id.button56);
        Button button17 = findViewById(R.id.button57);

        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        {
        switch (view.getId()) {
            case R.id.button17:
                Intent a = new Intent(Beard_Activity.this, beardoil.class);
                startActivity(a);
                break;

            case R.id.button52:
                Intent b = new Intent(Beard_Activity.this, beardmusoil.class);
                startActivity(b);
                break;

            case R.id.button53:
                Intent c = new Intent(Beard_Activity.this, beardserum.class);
                startActivity(c);
                break;

            case R.id.button54:
                Intent d = new Intent(Beard_Activity.this, beardwash.class);
                startActivity(d);
                break;

            case R.id.button55:
                Intent e = new Intent(Beard_Activity.this, beardcream.class);
                startActivity(e);
                break;

            case R.id.button56:
                Intent f = new Intent(Beard_Activity.this, beardwax.class);
                startActivity(f);
                break;

            case R.id.button57:
                Intent g = new Intent(Beard_Activity.this,beardcolour.class);
                startActivity(g);
                break;

            default:

    }
}}}