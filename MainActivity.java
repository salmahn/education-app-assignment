package com.bootcamp.salmah.yourcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSecondActivity(View view) {
        Intent firstIntent = new Intent(this, QuizActivity.class);
        startActivity(firstIntent);
    }

}
