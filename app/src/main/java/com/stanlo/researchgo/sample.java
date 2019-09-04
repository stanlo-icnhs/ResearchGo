package com.stanlo.researchgo;

import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDelegate;

public class sample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        //set title
        getSupportActionBar().setTitle("Sample Research Paper");
        //navigation welcome
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Your are in Sample Research Paper", Snackbar.LENGTH_LONG);
        snackbar.show();

    }
}
