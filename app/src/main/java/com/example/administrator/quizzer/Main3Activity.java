package com.example.administrator.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {
        public void start (View v) {
            Intent nextActivity = new Intent(Main3Activity.this, Main4Activity.class);
            startActivity(nextActivity);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
}
