package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rajasthan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);
    }
    public void miller(View view){
        Intent i1 = new Intent(this, david1.class);
        startActivity(i1);
    }
    public void vohra(View view){
        Intent i1 = new Intent(this, manan.class);
        startActivity(i1);
    }
    public void parag(View view){
        Intent i1 = new Intent(this, riyan.class);
        startActivity(i1);
    }
    public void morris(View view){
        Intent i1 = new Intent(this, chrism.class);
        startActivity(i1);
    }
    public void tewatia(View view){
        Intent i1 = new Intent(this, rahul2.class);
        startActivity(i1);
    }
    public void dube(View view){
        Intent i1 = new Intent(this, shivam.class);
        startActivity(i1);
    }
    public void gopal(View view){
        Intent i1 = new Intent(this, shreyash.class);
        startActivity(i1);
    }
    public void buttler(View view){
        Intent i1 = new Intent(this, joss.class);
        startActivity(i1);
    }
    public void samson(View view){
        Intent i1 = new Intent(this, sanju.class);
        startActivity(i1);
    }
    public void unadkat(View view){
        Intent i1 = new Intent(this, jaydev.class);
        startActivity(i1);
    }
    public void rahman(View view){
        Intent i1 = new Intent(this, must.class);
        startActivity(i1);
    }
}