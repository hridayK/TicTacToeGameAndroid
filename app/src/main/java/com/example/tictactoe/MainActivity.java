package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView winnerBoard;

    //shows the which player's turn is it
    private TextView pturn;


    //used for deciding whose turn is it
    private int count=0;

    //I used to call it X and Zero before the internet xD
    private final String ex = "X";
    private final String zero = "O";

    //all the buttons
    public Button fields[] = new Button[9];

    //ids of all the buttons that get assigned when compiler goes to onCreate()
    private final int IDS[] = {
            R.id.b00,
            R.id.b01,
            R.id.b02,
            R.id.b10,
            R.id.b11,
            R.id.b12,
            R.id.b20,
            R.id.b21,
            R.id.b22
    };

    Logic lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int index=0;
        for(int id:IDS){
            fields[index] = (Button) findViewById(id);
            index++;
        }
        pturn = (TextView) findViewById(R.id.textView2);
        winnerBoard = (TextView) findViewById(R.id.textView);
        pturn.setText("Player 1");

        lg = new Logic();
    }

    public void click00(View view) {
        if(count%2==0){
            fields[0].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[0].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[0].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click01(View view) {
        if(count%2==0){
            fields[1].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[1].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[1].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click02(View view) {
        if(count%2==0){
            fields[2].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[2].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[2].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click10(View view) {
        if(count%2==0){
            fields[3].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[3].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[3].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click11(View view) {
        if(count%2==0){
            fields[4].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[4].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[4].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click12(View view) {
        if(count%2==0){
            fields[5].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[5].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[5].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click20(View view) {
        if(count%2==0){
            fields[6].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[6].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[6].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click21(View view) {
        if(count%2==0){
            fields[7].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[7].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[7].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void click22(View view) {
        if(count%2==0){
            fields[8].setText(ex);
            pturn.setText("Player 2");
        }
        else{
            fields[8].setText(zero);
            pturn.setText("Player 1");
        }
        count++;
        fields[8].setClickable(false);
        if(lg.check(fields)==true)
            displayWinner();
    }

    public void displayWinner(){
        if(pturn.getText().toString() == "Player 1")
        winnerBoard.setText("Player 2"+" wins");
        if(pturn.getText().toString() == "Player 2")
            winnerBoard.setText("Player 1"+" wins");
        pturn.setText("");
    }
}