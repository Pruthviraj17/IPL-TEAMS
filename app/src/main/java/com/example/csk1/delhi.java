package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class delhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
    }
    public void rahane(View view){
        Intent i1 = new Intent(this, ajinkya.class);
        startActivity(i1);
    }
    public void shaw(View view){
        Intent i1 = new Intent(this, prithvi.class);
        startActivity(i1);
    }
    public void dhawan(View view){
        Intent i1 = new Intent(this, shikar.class);
        startActivity(i1);
    }
    public void hetmyer(View view){
        Intent i1 = new Intent(this, simron.class);
        startActivity(i1);
    }
    public void patel(View view){
        Intent i1 = new Intent(this, axar.class);
        startActivity(i1);
    }
    public void woakes(View view){
        Intent i1 = new Intent(this, chrisw.class);
        startActivity(i1);
    }
    public void stoinis(View view){
        Intent i1 = new Intent(this, marcus.class);
        startActivity(i1);
    }
    public void pant(View view){
        Intent i1 = new Intent(this, rishabh.class);
        startActivity(i1);
    }
    public void billings(View view){
        Intent i1 = new Intent(this, samb.class);
        startActivity(i1);
    }
    public void mishra(View view){
        Intent i1 = new Intent(this, amit.class);
        startActivity(i1);
    }
    public void nort(View view){
        Intent i1 = new Intent(this, anrich.class);
        startActivity(i1);
    }
}