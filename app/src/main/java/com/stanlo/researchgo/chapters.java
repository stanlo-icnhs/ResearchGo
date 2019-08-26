package com.stanlo.researchgo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class chapters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chapters);
        //set title
        getSupportActionBar().setTitle("Chapters");
        //navigation snackbar
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Your are in Chapters!", Snackbar.LENGTH_LONG);
        snackbar.show();



    }
}
