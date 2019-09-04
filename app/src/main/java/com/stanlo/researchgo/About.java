package com.stanlo.researchgo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;


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
