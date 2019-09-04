package com.stanlo.researchgo;

import android.content.Intent;

import androidx.annotation.StyleRes;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private CardView chapters;
    private  CardView quizzes;
    private CardView sample;
    private ImageView hamburger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //welcome snackbar
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Hello There User!!!", Snackbar.LENGTH_LONG);
        snackbar.show();
        getSupportActionBar().hide();











        //chapters Cast

        chapters = findViewById(R.id.chapters);
      chapters.setOnClickListener ( new View.OnClickListener () {
          @Override
          public void onClick(View v) {
              Intent chapters = new Intent ( MainActivity.this, chapters.class );
              startActivity(chapters);
          }
      } );

        //quizzes Cast

        quizzes = findViewById(R.id.quizzes);
        quizzes.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent sample = new Intent ( MainActivity.this, quizzes.class );
                startActivity(sample);
            }
        } );

        //sample Cast

        sample = findViewById(R.id.sample);
        sample.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent sample = new Intent ( MainActivity.this, sample.class );
                startActivity(sample);
            }
        } );

        // Options Long click

        chapters.setOnLongClickListener ( new View.OnLongClickListener () {
            @Override
            public boolean onLongClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Learn to how make a Research Paper", Snackbar.LENGTH_LONG);
                snackbar.show();

                return true;
            }
        } );

        quizzes.setOnLongClickListener ( new View.OnLongClickListener () {
            @Override
            public boolean onLongClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Test your knowledge in making papers", Snackbar.LENGTH_LONG);
                snackbar.show();

                return true;
            }
        } );

        sample.setOnLongClickListener ( new View.OnLongClickListener () {
            @Override
            public boolean onLongClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "View sample PDF Research Paper", Snackbar.LENGTH_LONG);
                snackbar.show();

                return true;
            }
        } );
    }











}
