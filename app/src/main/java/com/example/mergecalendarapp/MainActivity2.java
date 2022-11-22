package com.example.signin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void buttonClick3(View view) {
        Intent i= new Intent(MainActivity2.this, MainActivity4.class);
        MainActivity2.this.startActivity(i);
    }
    public void buttonBack(View view){
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        MainActivity2.this.startActivity(i);
    }

}