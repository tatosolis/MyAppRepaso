package com.asolis.myapp_repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void correr(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    public void restar(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void mult(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void div(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}