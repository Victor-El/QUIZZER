package com.example.administrator.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.start;
import static android.R.id.edit;
import static android.R.id.inputExtractEditText;

public class MainActivity extends AppCompatActivity {
    public void start (View v) {
        Intent nextActivity = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(nextActivity);
        EditText name = (EditText) findViewById(R.id.edit_text_1);
        name.getText().toString();
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }







}
