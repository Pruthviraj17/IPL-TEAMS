package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class punjab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);
    }
    public void gayle(View view){
        Intent i1 = new Intent(this, chrisg.class);
        startActivity(i1);
    }
    public void malan(View view){
        Intent i1 = new Intent(this, david.class);
        startActivity(i1);
    }
    public void singh(View view){
        Intent i1 = new Intent(this, mandeep.class);
        startActivity(i1);
    }
    public void agarwal(View view){
        Intent i1 = new Intent(this, mayank.class);
        startActivity(i1);
    }
    public void khan(View view){
        Intent i1 = new Intent(this, sarfaraz.class);
        startActivity(i1);
    }
    public void hooda(View view){
        Intent i1 = new Intent(this, deepak.class);
        startActivity(i1);
    }
    public void allen(View view){
        Intent i1 = new Intent(this, fabian.class);
        startActivity(i1);
    }
    public void rahul(View view){
        Intent i1 = new Intent(this, kl.class);
        startActivity(i1);
    }
    public void jordan(View view){
        Intent i1 = new Intent(this, chrisj.class);
        startActivity(i1);
    }
    public void shami(View view){
        Intent i1 = new Intent(this, shamim.class);
        startActivity(i1);
    }
    public void henr(View view){
        Intent i1 = new Intent(this, moises.class);
        startActivity(i1);
    }
}