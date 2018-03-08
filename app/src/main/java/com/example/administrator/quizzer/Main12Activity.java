package com.example.administrator.quizzer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.administrator.quizzer.MainActivity.gotIt;
import static com.example.administrator.quizzer.MainActivity.name;

public class Main12Activity extends AppCompatActivity {
    public void start(View v) {
        Intent nextActivity = new Intent(Main12Activity.this, MainActivity.class);
        startActivity(nextActivity);
        finish();
        gotIt = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        displayScore(name + " YOU SCORED " + gotIt + " OUT OF 10");

    }

    @Override
    public void onBackPressed() {
        finish();
        gotIt = 0;
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    public void displayScore(String score) {
        TextView scores = (TextView) findViewById(R.id.ansa);
        scores.setText(String.valueOf(score));
    }

}
