package com.example.mpipapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        initListeners();
    }

    private void initListeners() {
        Button firstListViewButton = findViewById(R.id.firstListViewButton);

        firstListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavActivity.this, FirstListViewActivity.class);

                startActivity(i);
            }
        });

        Button secondListViewButton = findViewById(R.id.secondListViewButton);

        secondListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavActivity.this, SecondListViewActivity.class);

                startActivity(i);
            }
        });

        Button recyclerViewButton = findViewById(R.id.recyclerViewButton);

        recyclerViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavActivity.this, RecyclerViewActivity.class);

                startActivity(i);
            }
        });

    }
}