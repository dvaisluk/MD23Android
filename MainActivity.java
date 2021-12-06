package com.example.md23;

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
    public void onClickAffairs(View view) {
        Intent intent = new Intent(this, Affairs.class);
        startActivity(intent);
    }
    public void onClickHP(View view) {
        Intent intent = new Intent(this, Health.class);
        startActivity(intent);
    }
    public void onClickComp(View view) {
        Intent intent = new Intent(this, Completed.class);
        startActivity(intent);
    }
    public void onClickINT(View view) {
        Intent intent = new Intent(this, Interest.class);
        startActivity(intent);
    }
}