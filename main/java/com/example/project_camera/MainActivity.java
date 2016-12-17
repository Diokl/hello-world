package com.example.project_camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final TextView text_view = (TextView) findViewById(R.id.text_view);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String a = new String();
                a = text_view.getText().toString();
                // a = "hello";
                String b = new String();
                b = editText.getText().toString();
                if (b.equals(a) & editText3.getText().toString().equals("") == false){
                    Intent intent = new Intent(MainActivity.this, all_vidjets.class);
                    intent.putExtra("name", editText3.getText().toString());
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Неправильный пароль. Попробуйте ещё раз!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            });
    }

}
