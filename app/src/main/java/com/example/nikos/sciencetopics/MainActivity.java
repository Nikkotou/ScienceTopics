package com.example.nikos.sciencetopics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // user's name and email variable declaration
    EditText playerNameField;
    EditText playerMailField;
    String playerName;
    String playerMail;

    // string variables for the toast message if user don't input name and email
    String playerNameEmailToastMessage;

    //declare toast message variables
    int duration;
    Toast toast;

    // variables state initialization for saving and restoring activity state
    static final String PLAYER_NAME_STATE = "nameOfPlayer";
    static final String PLAYER_EMAIL_STATE = "emailOfPlayer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaration all the findViewById calls
        playerNameField = findViewById(R.id.playername_field);
        playerMailField = findViewById(R.id.playeremail_field);

        //Editable emailEditable = playerMail.getText();
    }

    // onSaveInstanceState method to save the current variables value
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        //Save the current variables status
        savedInstanceState.putString(PLAYER_NAME_STATE, playerNameField.getText().toString());
        savedInstanceState.putString(PLAYER_EMAIL_STATE, playerMailField.getText().toString());

        // Superclass calling for saving
        super.onSaveInstanceState(savedInstanceState);
    }

    // onRestoreInstanceState method to restore the variables value
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state values from saved instance
        playerNameField.setText(savedInstanceState.getString(PLAYER_NAME_STATE));
        playerMailField.setText(savedInstanceState.getString(PLAYER_EMAIL_STATE));
    }

    /** Called when the user taps the Start Quiz button */
    public void openQuizActivity (View view) {

        // Get the typed strings fro name and mail
        playerName = playerNameField.getText().toString();
        playerMail = playerMailField.getText().toString();

        //check whether the user insert a name and a mail
        // if not show a toast message
        // if yes open the quiz activity and pass teh name and mail
        if (playerName.equals("") || playerMail.equals("")) {
            playerNameEmailToastMessage = getString(R.string.player_name_email_toast_error_message);
            duration = Toast.LENGTH_LONG;

            toast = Toast.makeText(this, playerNameEmailToastMessage, duration);
            toast.show();
        } else {
            Intent openQuizActivity = new Intent(this, QuizActivity.class);
            openQuizActivity.putExtra("playerName", playerName);
            openQuizActivity.putExtra("playerMail", playerMail);
            this.startActivity(openQuizActivity);
        }
    }
}
