package com.example.administrator.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.name;
import static android.R.attr.start;
import static android.R.id.edit;
import static android.R.id.inputExtractEditText;

public class MainActivity extends AppCompatActivity {
    public static String name;
    public static int gotIt = 0;

    public void start(View v) {
        Intent nextActivity = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(nextActivity);
        EditText userName = (EditText) findViewById(R.id.edit_text_1);
        name = userName.getText().toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }


}
