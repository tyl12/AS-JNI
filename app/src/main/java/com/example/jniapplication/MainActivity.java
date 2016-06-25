package com.example.jniapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        HelloJni jnitest = new HelloJni();
        tv.setText( jnitest.stringFromJNI() );
        setContentView(R.layout.activity_main);
    }
}
