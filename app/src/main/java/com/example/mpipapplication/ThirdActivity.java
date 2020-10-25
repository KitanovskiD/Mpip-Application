package com.example.mpipapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        iniListeners();
    }

    private void iniListeners() {
        Button btn = findViewById(R.id.button_alarm);

        final EditText hours_component = findViewById(R.id.alarm_hours);
        final EditText minutes_component = findViewById(R.id.alarm_minutes);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer hours = Integer.parseInt(hours_component.getText().toString());
                Integer minutes = Integer.parseInt(minutes_component.getText().toString());

                if(hours <= 24 && minutes <= 60){

                    Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);

                    i.putExtra(AlarmClock.EXTRA_HOUR, hours);
                    i.putExtra(AlarmClock.EXTRA_MINUTES, minutes);

                    startActivity(i);

                }
                else {
                    Toast.makeText(ThirdActivity.this, "Vnesete validni vrednosti!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}