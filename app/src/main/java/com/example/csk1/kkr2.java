package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kkr2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kkr2);
    }
    public void morgan(View view){
        Intent i1 = new Intent(this, eoin.class);
        startActivity(i1);
    }
    public void rana(View view){
        Intent i1 = new Intent(this, nitish.class);
        startActivity(i1);
    }
    public void trip(View view){
        Intent i1 = new Intent(this, rahul.class);
        startActivity(i1);
    }
    public void gill(View view){
        Intent i1 = new Intent(this, subh.class);
        startActivity(i1);
    }
    public void rusell(View view){
        Intent i1 = new Intent(this, andre.class);
        startActivity(i1);
    }
    public void cutting(View view){
        Intent i1 = new Intent(this, ben.class);
        startActivity(i1);
    }
    public void narine(View view){
        Intent i1 = new Intent(this, sunil.class);
        startActivity(i1);
    }
    public void karthik(View view){
        Intent i1 = new Intent(this, dinesh.class);
        startActivity(i1);
    }
    public void yadav(View view){
        Intent i1 = new Intent(this, kuldeep.class);
        startActivity(i1);
    }
    public void cummins(View view){
        Intent i1 = new Intent(this, pat.class);
        startActivity(i1);
    }
    public void negi(View view){
        Intent i1 = new Intent(this, pawan.class);
        startActivity(i1);
    }
}