package com.example.mpipapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getData();
        initListeners();
    }

    private void initListeners() {
        Button btn = findViewById(R.id.third_activity);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);

                startActivity(i);
            }
        });
    }

    private void getData() {
        Intent i = getIntent();

        String fristName = i.getStringExtra("firstName");
        String lastName = i.getStringExtra("lastName");

        TextView name = findViewById(R.id.name);
        TextView surname = findViewById(R.id.surname);

        name.setText(fristName);
        surname.setText(lastName);

    }
}