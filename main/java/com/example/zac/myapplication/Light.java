package com.example.zac.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Light extends AppCompatActivity {
    Boolean flag=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

    }

    /** Need to figure out how to switch this to scrolling */
    public void nextScreen(View view) {
        Intent intent = new Intent(this, Thermostat.class);
        startActivity(intent);
    }

    public void prevScreen(View view) {
        Intent intent = new Intent(this, Lock.class);
        startActivity(intent);
    }

    public void DeviceList(View view) {
        Intent intent = new Intent(this, DeviceList.class);
        startActivity(intent);
    }

    public void change_image(View v)
    {

        ImageView iv =(ImageView)findViewById(R.id.iv);
        //use flag to change image;
        if(flag==false)
        {
            iv.setImageResource(R.drawable.on);
            flag=true;
        }
        else
        {
            iv.setImageResource(R.drawable.off);
            flag=false;
        }
    }
}
