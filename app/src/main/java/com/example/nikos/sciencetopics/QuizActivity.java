package com.example.nikos.sciencetopics;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    // variables state initialization for saving and restoring activity state
    static final String STATE_PLAYER_SCORE = "scoreForPlayer";

    //Question 1 variables states
    static final String STATE_QUESTION1_RADIOBUTTON1 = "q1RadioButton1";
    static final String STATE_QUESTION1_RADIOBUTTON2 = "q1RadioButton2";
    static final String STATE_QUESTION1_RADIOBUTTON3 = "q1RadioButton3";
    static final String STATE_QUESTION1_RADIOBUTTON4 = "q1RadioButton4";

    //Question 2 variables states
    static final String STATE_QUESTION2_RADIOBUTTON1 = "q2RadioButton1";
    static final String STATE_QUESTION2_RADIOBUTTON2 = "q2RadioButton2";
    static final String STATE_QUESTION2_RADIOBUTTON3 = "q2RadioButton3";
    static final String STATE_QUESTION2_RADIOBUTTON4 = "q2RadioButton4";

    //Question 3 variables states
    static final String STATE_QUESTION3_EDITTEXT = "q3EditText";

    //Question 4 variables states
    static final String STATE_QUESTION4_RADIOBUTTON1 = "q4RadioButton1";
    static final String STATE_QUESTION4_RADIOBUTTON2 = "q4RadioButton2";
    static final String STATE_QUESTION4_RADIOBUTTON3 = "q4RadioButton3";

    //Question 5 variables states
    static final String STATE_QUESTION5_RADIOBUTTON1 = "q5RadioButton1";
    static final String STATE_QUESTION5_RADIOBUTTON2 = "q5RadioButton2";
    static final String STATE_QUESTION5_RADIOBUTTON3 = "q5RadioButton3";
    static final String STATE_QUESTION5_RADIOBUTTON4 = "q5RadioButton4";

    //Question 6 variables states
    static final String STATE_QUESTION6_RADIOBUTTON1 = "q6RadioButton1";
    static final String STATE_QUESTION6_RADIOBUTTON2 = "q6RadioButton2";
    static final String STATE_QUESTION6_RADIOBUTTON3 = "q6RadioButton3";

    //Question 7 variables states
    static final String STATE_QUESTION7_RADIOBUTTON1 = "q7RadioButton1";
    static final String STATE_QUESTION7_RADIOBUTTON2 = "q7RadioButton2";
    static final String STATE_QUESTION7_RADIOBUTTON3 = "q7RadioButton3";
    static final String STATE_QUESTION7_RADIOBUTTON4 = "q7RadioButton4";

    //Question 8 variables states
    static final String STATE_QUESTION8_RADIOBUTTON1 = "q8RadioButton1";
    static final String STATE_QUESTION8_RADIOBUTTON2 = "q8RadioButton2";
    static final String STATE_QUESTION8_RADIOBUTTON3 = "q8RadioButton3";
    static final String STATE_QUESTION8_RADIOBUTTON4 = "q8RadioButton4";

    //Question 9 variables states
    static final String STATE_QUESTION9_CHECKBOX1 = "q9CheckBox1";
    static final String STATE_QUESTION9_CHECKBOX2 = "q9CheckBox2";
    static final String STATE_QUESTION9_CHECKBOX3 = "q9CheckBox3";
    static final String STATE_QUESTION9_CHECKBOX4 = "q9CheckBox4";

    //Question 10 variables states
    static final String STATE_QUESTION10_RADIOBUTTON1 = "q10RadioButton1";
    static final String STATE_QUESTION10_RADIOBUTTON2 = "q10RadioButton2";
    static final String STATE_QUESTION10_RADIOBUTTON3 = "q10RadioButton3";
    static final String STATE_QUESTION10_RADIOBUTTON4 = "q10RadioButton4";

    //Question 11 variables states
    static final String STATE_QUESTION11_EDITTEXT = "q11EditText";

    //Question 12 variables states
    static final String STATE_QUESTION12_RADIOBUTTON1 = "q10RadioButton1";
    static final String STATE_QUESTION12_RADIOBUTTON2 = "q10RadioButton2";
    static final String STATE_QUESTION12_RADIOBUTTON3 = "q10RadioButton3";
    static final String STATE_QUESTION12_RADIOBUTTON4 = "q10RadioButton4";

    // variable for total score
    int score = 0;

    // variables for questions answers
    String question1Answer;
    String question2Answer;
    String question3Answer;
    String question4Answer;
    String question5Answer;
    String question6Answer;
    String question7Answer;
    String question8Answer;
    String question9Answer;
    String question10Answer;
    String question11Answer;
    String question12Answer;

    //Question1 button variables
    RadioButton question1RadioButton1;
    RadioButton question1RadioButton2;
    RadioButton question1RadioButton3;
    RadioButton question1RadioButton4;

    //Question2 button variables
    RadioButton question2RadioButton1;
    RadioButton question2RadioButton2;
    RadioButton question2RadioButton3;
    RadioButton question2RadioButton4;

    //Question3 EditText variable
    EditText question3EditText;

    //Question4 button variables
    RadioButton question4RadioButton1;
    RadioButton question4RadioButton2;
    RadioButton question4RadioButton3;

    //Question5 button variables
    RadioButton question5RadioButton1;
    RadioButton question5RadioButton2;
    RadioButton question5RadioButton3;
    RadioButton question5RadioButton4;

    //Question6 button variables
    RadioButton question6RadioButton1;
    RadioButton question6RadioButton2;
    RadioButton question6RadioButton3;

    //Question7 button variables
    RadioButton question7RadioButton1;
    RadioButton question7RadioButton2;
    RadioButton question7RadioButton3;
    RadioButton question7RadioButton4;

    //Question8 button variables
    RadioButton question8RadioButton1;
    RadioButton question8RadioButton2;
    RadioButton question8RadioButton3;
    RadioButton question8RadioButton4;

    //Question9 check Box variables
    CheckBox question9CheckBox1;
    CheckBox question9CheckBox2;
    CheckBox question9CheckBox3;
    CheckBox question9CheckBox4;

    //Question10 button variables
    RadioButton question10RadioButton1;
    RadioButton question10RadioButton2;
    RadioButton question10RadioButton3;
    RadioButton question10RadioButton4;

    //Question11 EditText variable
    EditText question11EditText;

    //Question12 button variables
    RadioButton question12RadioButton1;
    RadioButton question12RadioButton2;
    RadioButton question12RadioButton3;
    RadioButton question12RadioButton4;

    String playerName;
    String playerMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //declaration all the findViewById calls
        // Question 1
        question1RadioButton1 = findViewById(R.id.question1_radioButton1);
        question1RadioButton2 = findViewById(R.id.question1_radioButton2);
        question1RadioButton3 = findViewById(R.id.question1_radioButton3);
        question1RadioButton4 = findViewById(R.id.question1_radioButton4);

        // Question 2
        question2RadioButton1 = findViewById(R.id.question2_radioButton1);
        question2RadioButton2 = findViewById(R.id.question2_radioButton2);
        question2RadioButton3 = findViewById(R.id.question2_radioButton3);
        question2RadioButton4 = findViewById(R.id.question2_radioButton4);

        // Question 3
        question3EditText = findViewById(R.id.question3_editText);

        // Question 4
        question4RadioButton1 = findViewById(R.id.question4_radioButton1);
        question4RadioButton2 = findViewById(R.id.question4_radioButton2);
        question4RadioButton3 = findViewById(R.id.question4_radioButton3);

        // Question 5
        question5RadioButton1 = findViewById(R.id.question5_radioButton1);
        question5RadioButton2 = findViewById(R.id.question5_radioButton2);
        question5RadioButton3 = findViewById(R.id.question5_radioButton3);
        question5RadioButton4 = findViewById(R.id.question5_radioButton4);

        // Question 6
        question6RadioButton1 = findViewById(R.id.question6_radioButton1);
        question6RadioButton2 = findViewById(R.id.question6_radioButton2);
        question6RadioButton3 = findViewById(R.id.question6_radioButton3);

        // Question 7
        question7RadioButton1 = findViewById(R.id.question7_radioButton1);
        question7RadioButton2 = findViewById(R.id.question7_radioButton2);
        question7RadioButton3 = findViewById(R.id.question7_radioButton3);
        question7RadioButton4 = findViewById(R.id.question7_radioButton4);

        // Question 8
        question8RadioButton1 = findViewById(R.id.question8_radioButton1);
        question8RadioButton2 = findViewById(R.id.question8_radioButton2);
        question8RadioButton3 = findViewById(R.id.question8_radioButton3);
        question8RadioButton4 = findViewById(R.id.question8_radioButton4);

        // Question 9
        question9CheckBox1 = findViewById(R.id.question9_checkBox1);
        question9CheckBox2 = findViewById(R.id.question9_checkBox2);
        question9CheckBox3 = findViewById(R.id.question9_checkBox3);
        question9CheckBox4 = findViewById(R.id.question9_checkBox4);

        // Question 10
        question10RadioButton1 = findViewById(R.id.question10_radioButton1);
        question10RadioButton2 = findViewById(R.id.question10_radioButton2);
        question10RadioButton3 = findViewById(R.id.question10_radioButton3);
        question10RadioButton4 = findViewById(R.id.question10_radioButton4);

        // Question 11
        question11EditText = findViewById(R.id.question11_editText);

        // Question 12
        question12RadioButton1 = findViewById(R.id.question12_radioButton1);
        question12RadioButton2 = findViewById(R.id.question12_radioButton2);
        question12RadioButton3 = findViewById(R.id.question12_radioButton3);
        question12RadioButton4 = findViewById(R.id.question12_radioButton4);

        // Get player's name and email from previous activity
        playerName = getIntent().getExtras().getString("playerName");
        playerMail = getIntent().getExtras().getString("playerMail");

    }

    // onSaveInstanceState method to save the current variables value
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        //Save the current variables value
        // Player score
        savedInstanceState.putInt(STATE_PLAYER_SCORE, score);

        //question 1
        savedInstanceState.putBoolean(STATE_QUESTION1_RADIOBUTTON1, question1RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION1_RADIOBUTTON2, question1RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION1_RADIOBUTTON3, question1RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION1_RADIOBUTTON4, question1RadioButton4.isChecked());

        //question 2
        savedInstanceState.putBoolean(STATE_QUESTION2_RADIOBUTTON1, question2RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION2_RADIOBUTTON2, question2RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION2_RADIOBUTTON3, question2RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION2_RADIOBUTTON4, question2RadioButton4.isChecked());

        //question 3
        savedInstanceState.putString(STATE_QUESTION3_EDITTEXT, question3EditText.getText().toString());

        //question 4
        savedInstanceState.putBoolean(STATE_QUESTION4_RADIOBUTTON1, question4RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION4_RADIOBUTTON2, question4RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION4_RADIOBUTTON3, question4RadioButton3.isChecked());

        //question 5
        savedInstanceState.putBoolean(STATE_QUESTION5_RADIOBUTTON1, question5RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION5_RADIOBUTTON2, question5RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION5_RADIOBUTTON3, question5RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION5_RADIOBUTTON4, question5RadioButton4.isChecked());

        //question 6
        savedInstanceState.putBoolean(STATE_QUESTION6_RADIOBUTTON1, question6RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION6_RADIOBUTTON2, question6RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION6_RADIOBUTTON3, question6RadioButton3.isChecked());

        //question 7
        savedInstanceState.putBoolean(STATE_QUESTION7_RADIOBUTTON1, question7RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION7_RADIOBUTTON2, question7RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION7_RADIOBUTTON3, question7RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION7_RADIOBUTTON4, question7RadioButton4.isChecked());

        //question 8
        savedInstanceState.putBoolean(STATE_QUESTION8_RADIOBUTTON1, question8RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION8_RADIOBUTTON2, question8RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION8_RADIOBUTTON3, question8RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION8_RADIOBUTTON4, question8RadioButton4.isChecked());

        //question 9
        savedInstanceState.putBoolean(STATE_QUESTION9_CHECKBOX1, question9CheckBox1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION9_CHECKBOX2, question9CheckBox2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION9_CHECKBOX3, question9CheckBox3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION9_CHECKBOX4, question9CheckBox4.isChecked());

        //question 10
        savedInstanceState.putBoolean(STATE_QUESTION10_RADIOBUTTON1, question10RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION10_RADIOBUTTON2, question10RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION10_RADIOBUTTON3, question10RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION10_RADIOBUTTON4, question10RadioButton4.isChecked());

        //question 11
        savedInstanceState.putString(STATE_QUESTION11_EDITTEXT, question11EditText.getText().toString());

        //question 12
        savedInstanceState.putBoolean(STATE_QUESTION12_RADIOBUTTON1, question12RadioButton1.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION12_RADIOBUTTON2, question12RadioButton2.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION12_RADIOBUTTON3, question12RadioButton3.isChecked());
        savedInstanceState.putBoolean(STATE_QUESTION12_RADIOBUTTON4, question12RadioButton4.isChecked());

        // Superclass calling for saving
        super.onSaveInstanceState(savedInstanceState);
    }

    // onRestoreInstanceState method to restore the variables value
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state values from saved instance
        // Question 1
        question1RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION1_RADIOBUTTON1));
        question1RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION1_RADIOBUTTON2));
        question1RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION1_RADIOBUTTON3));
        question1RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION1_RADIOBUTTON4));

        // Question 2
        question2RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION2_RADIOBUTTON1));
        question2RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION2_RADIOBUTTON2));
        question2RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION2_RADIOBUTTON3));
        question2RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION2_RADIOBUTTON4));

        // Question 3
        question11EditText.setText(savedInstanceState.getString(STATE_QUESTION11_EDITTEXT));

        // Question 4
        question4RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION4_RADIOBUTTON1));
        question4RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION4_RADIOBUTTON2));
        question4RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION4_RADIOBUTTON3));

        // Question 5
        question5RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION5_RADIOBUTTON1));
        question5RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION5_RADIOBUTTON2));
        question5RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION5_RADIOBUTTON3));
        question5RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION5_RADIOBUTTON4));

        // Question 6
        question6RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION6_RADIOBUTTON1));
        question6RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION6_RADIOBUTTON2));
        question6RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION6_RADIOBUTTON3));

        // Question 7
        question7RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION7_RADIOBUTTON1));
        question7RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION7_RADIOBUTTON2));
        question7RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION7_RADIOBUTTON3));
        question7RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION7_RADIOBUTTON4));

        // Question 8
        question8RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION8_RADIOBUTTON1));
        question8RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION8_RADIOBUTTON2));
        question8RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION8_RADIOBUTTON3));
        question8RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION8_RADIOBUTTON4));

        // Question 9
        question9CheckBox1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION9_CHECKBOX1));
        question9CheckBox2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION9_CHECKBOX2));
        question9CheckBox3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION9_CHECKBOX3));
        question9CheckBox4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION9_CHECKBOX4));

        // Question 10
        question10RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION10_RADIOBUTTON1));
        question10RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION10_RADIOBUTTON2));
        question10RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION10_RADIOBUTTON3));
        question10RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION10_RADIOBUTTON4));

        // Question 11
        question11EditText.setText(savedInstanceState.getString(STATE_QUESTION11_EDITTEXT));

        // Question 12
        question12RadioButton1.setChecked(savedInstanceState.getBoolean(STATE_QUESTION12_RADIOBUTTON1));
        question12RadioButton2.setChecked(savedInstanceState.getBoolean(STATE_QUESTION12_RADIOBUTTON2));
        question12RadioButton3.setChecked(savedInstanceState.getBoolean(STATE_QUESTION12_RADIOBUTTON3));
        question12RadioButton4.setChecked(savedInstanceState.getBoolean(STATE_QUESTION12_RADIOBUTTON4));
    }

    // calculate 1st answer
    private void answer1 (){

        if(question1RadioButton2.isChecked()){
            score += 1;
            question1Answer = "You correctly answered: A comet" ;
        }
    }

    // calculate 2nd answer
    private void answer2 (){

        if(question2RadioButton1.isChecked()){
            score += 1;
            question2Answer = "You correctly answered: Radio waves" ;
        }
    }

    private void answer3 (){

        if(question3EditText.getText().toString().equals("The inner")){
            score += 1;
            question3Answer = "You correctly answered: The inner layer, called the Earth’s core" ;
        }
    }

    private void answer4 (){

        if(question4RadioButton2.isChecked()){
            score += 1;
            question4Answer = "You correctly answered: The gravitational pull of the moon" ;
        }
    }

    private void answer5 (){

        if(question5RadioButton3.isChecked()){
            score += 1;
            question5Answer = "You correctly answered: Distance";
        }
    }

    private void answer6 (){

        if(question6RadioButton1.isChecked()){
            score += 1;
            question6Answer = "You correctly answered: Water boils at a lower temperature in Denver than Los Angeles";
        }
    }

    private void answer7 (){

        if(question7RadioButton3.isChecked()){
            score += 1;
            question7Answer = "You correctly answered: 3rd picture";
        }
    }

    private void answer8 (){

        if(question8RadioButton4.isChecked()){
            score += 1;
            question8Answer = "You correctly answered: Amplitude or height";
        }
    }

    private void answer9 (){

        if(question9CheckBox3.isChecked()){
        score += 1;
        question9Answer = "You correctly answered: The more sugar people eat, the more likely they are to get cavities";
        }
    }

    private void answer10 (){

        if(question10RadioButton2.isChecked()){
            score += 1;
            question10Answer = "You correctly answered: Uranium";
        }
    }

    private void answer11 (){

        if(question11EditText.getText().toString().equals("Jonas Salk")){
            score += 1;
            question11Answer = "You correctly answered: Jonas Salk" ;
        }
    }

    private void answer12 (){

        if(question12RadioButton1.isChecked()){
            score += 1;
            question12Answer = "You correctly answered: Astrology";
        }
    }


    public void openResultActivity(View view) {

        totalScore();
        Intent openResultActivity = new Intent(this, ResultActivity.class);
        openResultActivity.putExtra("playerName", playerName);
        openResultActivity.putExtra("playerMail", playerMail);
        openResultActivity.putExtra("score",score);
        this.startActivity(openResultActivity);
    }

    // calculates the total score
    public void totalScore (){
        answer1();
        answer2();
        answer3();
        answer4();
        answer5();
        answer6();
        answer7();
        answer8();
        answer9();
        answer10();
        answer11();
        answer12();
    }

}
