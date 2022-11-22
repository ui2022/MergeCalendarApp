package com.example.signin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

    }

    public void buttonClick6(View view) {
        Intent i= new Intent(MainActivity6.this, MainActivity.class);
        MainActivity6.this.startActivity(i);
    }
    public void buttonBack(View view){
        Intent i = new Intent(MainActivity6.this, MainActivity5.class);
        MainActivity6.this.startActivity(i);
    }






}