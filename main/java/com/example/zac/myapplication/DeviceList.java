package com.example.zac.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DeviceList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);
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
}
/*
public class DeviceList extends AppCompatActivity implements OnClickListener {
    private GestureDetector gestureDetector;
    View.OnTouchListener gestureListener;
    ImageButton flora, fauna;
    Intent go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_list);

        initialize();

        gestureDetector = new GestureDetector(new SwipeGestureDetector());
        gestureListener = new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                return gestureDetector.onTouchEvent(event);
            }
        };
    }

    private void initialize() {
        //find view by id to image button
        //set onClickListener to image button
    }

    public void onClick(View v) {
        //normal switch and case for each button

    }

    private void onLeftSwipe() {
        Toast t = Toast.makeText(Home.this, "Left swipe", Toast.LENGTH_LONG);
        t.show();
        go = new Intent("test.apps.FLORA");
        startActivity(go);
    }

    private void onRightSwipe() {
        Toast t = Toast.makeText(Home.this, "Right swipe", Toast.LENGTH_LONG);
        t.show();
        go = new Intent("test.apps.FAUNA");
        startActivity(go);
    }

    private class SwipeGestureDetector extends SimpleOnGestureListener {
        private static final int SWIPE_MIN_DISTANCE = 50;
        private static final int SWIPE_MAX_OFF_PATH = 200;
        private static final int SWIPE_THRESHOLD_VELOCITY = 200;

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                               float velocityY) {
            try {
                Toast t = Toast.makeText(Home.this, "Gesture detected", Toast.LENGTH_SHORT);
                t.show();
                float diffAbs = Math.abs(e1.getY() - e2.getY());
                float diff = e1.getX() - e2.getX();

                if (diffAbs > SWIPE_MAX_OFF_PATH)
                    return false;

                // Left swipe
                if (diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    Home.this.onLeftSwipe();
                }
                // Right swipe
                else if (-diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    Home.this.onRightSwipe();
                }
            } catch (Exception e) {
                Log.e("Home", "Error on gestures");
            }
            return false;
        }

    }

}
*/
