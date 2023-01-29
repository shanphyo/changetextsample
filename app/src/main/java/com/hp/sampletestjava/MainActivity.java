package com.hp.sampletestjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView changetext=(TextView) findViewById(R.id.txt_name);
        Button btn=(Button) findViewById(R.id.btn_changetext);
        btn.setOnClickListener(v -> changetext.setText("i"));


    }
}