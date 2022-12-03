package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void csk(View view) {
        Intent i1=new Intent(MainActivity.this,csk3.class);
        startActivity(i1);
    }

    public void rcb(View view) {
        Intent i1=new Intent(MainActivity.this,rcb2.class);
        startActivity(i1);
    }
    public void kkr(View view) {
        Intent i1=new Intent(MainActivity.this,kkr2.class);
        startActivity(i1);
    }
    public void dc(View view) {
        Intent i1=new Intent(MainActivity.this,delhi.class);
        startActivity(i1);
    }
    public void pbks(View view) {
        Intent i1=new Intent(MainActivity.this,punjab.class);
        startActivity(i1);
    }
    public void mi(View view) {
        Intent i1=new Intent(MainActivity.this,mumbai.class);
        startActivity(i1);
    }
    public void rr(View view) {
        Intent i1=new Intent(MainActivity.this,rajasthan.class);
        startActivity(i1);
    }
    public void srh(View view) {
        Intent i1=new Intent(MainActivity.this,sunrisers.class);
        startActivity(i1);
    }

    public void hist(View view) {
        Intent i1=new Intent(MainActivity.this,hist1.class);
        startActivity(i1);
    }
}