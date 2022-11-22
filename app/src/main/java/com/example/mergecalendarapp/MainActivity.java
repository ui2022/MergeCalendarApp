package com.example.signin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick2(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        MainActivity.this.startActivity(i);
    }

    public void buttonClick(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity3.class);
        MainActivity.this.startActivity(i);
    }

}