package com.stanlo.researchgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.CardView;
import android.view.View;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //set title
        getSupportActionBar().setTitle("About");
        getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);



    }



}
