package com.example.project_camera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class all_vidjets extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_vidjets);
        Button camera = (Button) findViewById(R.id.camera);
        final TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Hello" + " " + getIntent().getStringExtra("name") + "!");
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // textView.setText("Hello");
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CAMERA_BUTTON);
                intent.putExtra(Intent.EXTRA_KEY_EVENT, new KeyEvent(KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_CAMERA));
                sendOrderedBroadcast(intent, null);
            }
        });
        Button change_password = (Button) findViewById(R.id.change_password);
        change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button Chronometr = (Button)  findViewById(R.id.Chronometr);
        Chronometr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(all_vidjets.this, Chronometr.class);
                startActivity(intent);
            }
        });
        Button YouTube = (Button) findViewById(R.id.youtube);
        YouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address = Uri.parse("http://youtube.ru");
                Intent intent = new Intent(Intent.ACTION_VIEW, address);
                startActivity(intent);

            }
        });
    }

}
