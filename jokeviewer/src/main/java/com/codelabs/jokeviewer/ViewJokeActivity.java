package com.codelabs.jokeviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_joke);
        Intent i = getIntent();
        String jk = i.getStringExtra("JOKE_KEY");
        TextView jokeTV = findViewById(R.id.jokeTV);
        jokeTV.setText(jk);
    }
}
