package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a1(View view) {
        teamAScore = teamAScore + 1;
        displayTeamA();
    }
    public void a2(View view) {
        teamAScore = teamAScore + 2;
        displayTeamA();
    }
    public void a3(View view) {
        teamAScore = teamAScore + 3;
        displayTeamA();
    }
    public void b1(View view) {
        teamBScore = teamBScore + 1;
        displayTeamB();
    }
    public void b2(View view) {
        teamBScore = teamBScore + 2;
        displayTeamB();
    }
    public void b3(View view) {
        teamBScore = teamBScore + 3;
        displayTeamB();
    }
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayTeamAB();
    }
    private void displayTeamA() {
        TextView aScore = (TextView) findViewById(R.id.teamAScore);
        aScore.setText(Integer.toString(teamAScore));
    }
    private void displayTeamB() {
        TextView bScore = (TextView) findViewById(R.id.teamBScore);
        bScore.setText(Integer.toString(teamBScore));
    }
    private void displayTeamAB() {
        TextView aScore = (TextView) findViewById(R.id.teamAScore);
        aScore.setText(Integer.toString(teamAScore));
        TextView bScore = (TextView) findViewById(R.id.teamBScore);
        bScore.setText(Integer.toString(teamBScore));
    }
}
