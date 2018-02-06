package com.example.nikos.sciencetopics;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    int finalScore = 0;
    String playerName;
    String playerMail;

    TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        finalScore = getIntent().getExtras().getInt("score");
        playerName = getIntent().getExtras().getString("playerName");
        playerMail = getIntent().getExtras().getString("playerMail");

        showResult = (TextView) findViewById(R.id.result_message_textview);
        showResult.setText("You answered " + finalScore + " of 12 question correctly");


    }

}
