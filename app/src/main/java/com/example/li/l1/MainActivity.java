package com.example.li.l1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private int scoreA;
    private int scoreB;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v) {
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }


    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }


    public void addThreeForTeamA(View v) {
        displayForTeamA(3);
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View v) {
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }


    public void addTwoForTeamB(View v) {
        scoreB=scoreB+2;
        displayForTeamA(scoreB);
    }


    public void addThreeForTeamB(View v) {
        scoreB=scoreB+3;
        displayForTeamA(scoreB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
    public void restScore(View v){
        displayForTeamA(0);
        displayForTeamB(0);
        scoreA=0;
        scoreB=0;

    }
}
