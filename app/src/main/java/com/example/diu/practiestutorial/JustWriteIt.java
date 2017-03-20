package com.example.diu.practiestutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JustWriteIt extends AppCompatActivity {


    private Button mybutton;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_write_it);

        TextView mytext=(TextView) findViewById(R.id.text);
        text=(TextView) findViewById(R.id.text1);
        mytext.setText("MD SHIHAB ALI");

        mybutton=(Button) findViewById(R.id.button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}
