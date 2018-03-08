package com.example.administrator.quizzer;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.start;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.administrator.quizzer.MainActivity.gotIt;
import static com.example.administrator.quizzer.R.drawable.n;

public class Main2Activity extends AppCompatActivity {
    public void start(View v) {
        Intent nextActivity = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(nextActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void score(View v) {
        RadioButton rb = (RadioButton) findViewById(R.id.radio_bt22);
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
