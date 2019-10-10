package com.stanlo.researchgo;

import android.content.Intent;

import androidx.annotation.StyleRes;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //welcome snackbar
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Hello There User!!!", Snackbar.LENGTH_LONG);
        snackbar.show();
        getSupportActionBar().hide();





    }











}

