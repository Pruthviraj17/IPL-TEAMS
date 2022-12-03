package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mumbai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);
    }
    public void lynn(View view){
        Intent i1 = new Intent(this, chrisl.class);
        startActivity(i1);
    }
    public void sharma(View view){
        Intent i1 = new Intent(this, rohit.class);
        startActivity(i1);
    }
    public void yadav1(View view){
        Intent i1 = new Intent(this, surya.class);
        startActivity(i1);
    }
    public void pandya(View view){
        Intent i1 = new Intent(this, hardik.class);
        startActivity(i1);
    }
    public void pollard(View view){
        Intent i1 = new Intent(this, kieron.class);
        startActivity(i1);
    }
    public void pandya1(View view){
        Intent i1 = new Intent(this, krunal.class);
        startActivity(i1);
    }
    public void kishan(View view){
        Intent i1 = new Intent(this, ishan.class);
        startActivity(i1);
    }
    public void kock(View view){
        Intent i1 = new Intent(this, quint.class);
        startActivity(i1);
    }
    public void bumrah(View view){
        Intent i1 = new Intent(this, jasprit.class);
        startActivity(i1);
    }
    public void chahar1(View view){
        Intent i1 = new Intent(this, rahul1.class);
        startActivity(i1);
    }
    public void boult(View view){
        Intent i1 = new Intent(this, trent.class);
        startActivity(i1);
    }
}