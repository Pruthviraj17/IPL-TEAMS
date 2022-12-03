package com.example.csk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class csk3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csk3);
    }
    public void ab1 (View view){
        Intent i1 = new Intent(this,ambati.class);
        startActivity(i1);
    }
    public void ms (View view){
        Intent i1 = new Intent(this, msd.class);
        startActivity(i1);
    }

    public void faf (View view){
        Intent i1 = new Intent(this, fafu.class);
        startActivity(i1);
    }
    public void rutu (View view){
        Intent i1 = new Intent(this, rut.class);
        startActivity(i1);
    }

    public void suru (View view){
        Intent i1 = new Intent(this, sur.class);
        startActivity(i1);
    }

    public void dwayne (View view){
        Intent i1 = new Intent(this, db1.class);
        startActivity(i1);
    }

    public void ali (View view){
        Intent i1 = new Intent(this, ma3.class);
        startActivity(i1);
    }

    public void jadeja (View view){
        Intent i1 = new Intent(this, rj.class);
        startActivity(i1);
    }

    public void curran (View view){
        Intent i1 = new Intent(this, sc.class);
        startActivity(i1);
    }

    public void chahar (View view){
        Intent i1 = new Intent(this, dc.class);
        startActivity(i1);
    }

    public void thakur (View view){
        Intent i1 = new Intent(this, st.class);
        startActivity(i1);
    }

    public void chaharde (View view){
        Intent i1 = new Intent(this, it.class);
        startActivity(i1);
    }


}