package com.example.zac.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.NumberPicker;

public class Thermostat extends AppCompatActivity {


    NumberPicker nopicker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermostat);

        nopicker = (NumberPicker) findViewById(R.id.numberPicker);
        nopicker.setMaxValue(100);
        nopicker.setMinValue(50);
        nopicker.setValue(72);
        nopicker.setWrapSelectorWheel(false);
    }

        /** Need to figure out how to switch this to scrolling */

    public void nextScreen(View view) {
        Intent intent = new Intent(this, Lock.class);
        startActivity(intent);
    }

    public void prevScreen(View view) {
        Intent intent = new Intent(this, Light.class);
        startActivity(intent);
    }

    }


