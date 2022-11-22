package com.example.signin3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void buttonBack(View view){
        Intent i = new Intent(MainActivity4.this, MainActivity2.class);
        MainActivity4.this.startActivity(i);
    }

    public void buttonClick4(View view) {
        Intent i= new Intent(MainActivity4.this, MainActivity5.class);
        MainActivity4.this.startActivity(i);
    }


}