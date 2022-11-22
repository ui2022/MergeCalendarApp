package com.example.signin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void buttonBack(View view){
        Intent i = new Intent(MainActivity5.this, MainActivity4.class);
        MainActivity5.this.startActivity(i);
    }

    public void buttonClick5(View view) {
        Intent i= new Intent(MainActivity5.this, MainActivity6.class);
        MainActivity5.this.startActivity(i);
    }



}