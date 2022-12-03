package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sunrisers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunrisers);
    }
    public void warner(View view){
        Intent i1 = new Intent(this, david2.class);
        startActivity(i1);
    }
    public void roy(View view){
        Intent i1 = new Intent(this, jason.class);
        startActivity(i1);
    }
    public void william(View view){
        Intent i1 = new Intent(this, kane.class);
        startActivity(i1);
    }
    public void jadhav(View view){
        Intent i1 = new Intent(this, kedar.class);
        startActivity(i1);
    }
    public void pandey(View view){
        Intent i1 = new Intent(this, manish.class);
        startActivity(i1);
    }
    public void garg(View view){
        Intent i1 = new Intent(this, priyam.class);
        startActivity(i1);
    }
    public void holder(View view){
        Intent i1 = new Intent(this, jason1.class);
        startActivity(i1);
    }
    public void shankar(View view){
        Intent i1 = new Intent(this, vijay.class);
        startActivity(i1);
    }
    public void bairstow(View view){
        Intent i1 = new Intent(this, jonny.class);
        startActivity(i1);
    }
    public void saha(View view){
        Intent i1 = new Intent(this, wrid.class);
        startActivity(i1);
    }
    public void khan1(View view){
        Intent i1 = new Intent(this, rashid.class);
        startActivity(i1);
    }
}