package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rcb2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcb2);
    }
    public void padikkal(View view){
        Intent i1 = new Intent(this, padikal.class);
        startActivity(i1);
    }
    public void vk(View view){
        Intent i1 = new Intent(this, virat.class);
        startActivity(i1);
    }
    public void dan(View view){
        Intent i1 = new Intent(this, chris.class);
        startActivity(i1);
    }
    public void sams(View view){
        Intent i1 = new Intent(this, sams2.class);
        startActivity(i1);
    }
    public void glenn(View view){
        Intent i1 = new Intent(this, max.class);
        startActivity(i1);
    }
    public void sundar(View view){
        Intent i1 = new Intent(this, sun.class);
        startActivity(i1);
    }
    public void abd(View view){
        Intent i1 = new Intent(this, dev.class);
        startActivity(i1);
    }
    public void harsh(View view){
        Intent i1 = new Intent(this, patel.class);
        startActivity(i1);
    }
    public void siraj(View view){
        Intent i1 = new Intent(this, sir.class);
        startActivity(i1);
    }
    public void saini(View view){
        Intent i1 = new Intent(this, navdeep.class);
        startActivity(i1);
    }
    public void chahal(View view){
        Intent i1 = new Intent(this, yuzi.class);
        startActivity(i1);
    }
}