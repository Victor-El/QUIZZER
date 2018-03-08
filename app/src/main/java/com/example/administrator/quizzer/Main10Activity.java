package com.example.administrator.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.administrator.quizzer.MainActivity.gotIt;

public class Main10Activity extends AppCompatActivity {
    public void start(View v) {
        Intent nextActivity = new Intent(Main10Activity.this, Main11Activity.class);
        startActivity(nextActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }

    public void score(View v) {
        RadioButton rb = (RadioButton) findViewById(R.id.radio_bt103);
        if (rb.isChecked()) {
            gotIt = gotIt + 1;
            Toast.makeText(this, "Success!!!, you earned " + gotIt + " points so far", Toast.LENGTH_SHORT).show();
            if (rb.isChecked()) {
                rb.setClickable(false);
            }

        } else {
            gotIt = gotIt + 0;
            Toast.makeText(this, "Failure!!!, you earned " + gotIt + "  points so far", Toast.LENGTH_SHORT).show();

        }
    }
}
