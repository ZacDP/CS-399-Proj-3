package com.example.zac.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock);
    }

    /** Need to figure out how to switch this to scrolling */
    public void nextScreen(View view) {
        Intent intent = new Intent(this, DeviceList.class);
        startActivity(intent);
    }

    public void prevScreen(View view) {
        Intent intent = new Intent(this, Thermostat.class);
        startActivity(intent);
    }
}
