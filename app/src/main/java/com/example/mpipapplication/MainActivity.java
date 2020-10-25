package com.example.mpipapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public static String tag = "MainActivity: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "On-Create Method Called.");

        initListeners();
    }

    private void initListeners() {
        Button btn = findViewById(R.id.first_button);

        final EditText first_name = findViewById(R.id.first_name);
        final EditText last_name = findViewById(R.id.last_name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_name.getText().length() > 0 && last_name.getText().length() > 0) {
                    String firstName = first_name.getText().toString().trim();
                    String lastName = last_name.getText().toString().trim();

                    Intent i = new Intent(MainActivity.this, SecondActivity.class); //Ekspliciten intent (Od MainActivity -> SecondActivity)

                    i.putExtra("firstName", firstName);
                    i.putExtra("lastName", lastName);

                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Polinjata se prazni!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "On-Start Method Called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "On-Resume Method Called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "On-Pause Method Called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "On-Stop Method Called.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "On-Restart Method Called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "On-Destroy Method Called.");
    }
}