package com.example.project_camera;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Chronometr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button Start  = (Button) findViewById(R.id.Start);
        final Chronometer chronom = (Chronometer) findViewById(R.id.chronometer2);
        chronom.stop();
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chronom.start();
            }
        });
        Button Stop  = (Button) findViewById(R.id.Stop);
        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronom.stop();
            }
        });
        Button Clean = (Button) findViewById(R.id.Clean);
        Clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronom.setBase(SystemClock.elapsedRealtime());
            }
        });

    }

}
