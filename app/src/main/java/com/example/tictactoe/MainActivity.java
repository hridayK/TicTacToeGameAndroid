package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //used for deciding whose turn is it
    private int count=0;

    //I used to call it X and Zero before the internet xD
    private final String ex = "X";
    private final String zero = "O";

    //player one turn
    private boolean p1Turn = true;

    //player1/2points
    private int p1p;
    private int p2p;

    //all the buttons
    private Button[][] btn = new Button[3][3];

    //text views of player 1 and 2
    private TextView TvPlayer1;
    private TextView TvPlayer2;

    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TvPlayer1 = (TextView) findViewById(R.id.player1);
        TvPlayer2 = (TextView) findViewById(R.id.player2);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                String buttonID = "b"+i+""+j;
                int ID = getResources().getIdentifier(buttonID,"id",getPackageName());
                btn[i][j] = (Button) findViewById(ID);
            }
        }

        reset = (Button) findViewById(R.id.reset);
    }

    public void clicked(View view){
        if(!((Button) view).getText().toString().equals("")){
            return;
        }

        if(p1Turn){
            ((Button) view).setText("X");
            p1Turn = false;
        }else{
            ((Button) view).setText("O");
            p1Turn = true;
        }

        count++;

        if(CheckWin()){
            if(!p1Turn)
                p1wins();
            else
                p2wins();
        }else if(count==9){
            Toast.makeText(this,"Draw",Toast.LENGTH_SHORT).show();
        }
        
    }

    //player one wins
    private void p1wins(){
        Toast.makeText(this, "Player 1 wins", Toast.LENGTH_SHORT).show();
    }

    //player two wins
    private void p2wins(){
        Toast.makeText(this, "Player 2 wins", Toast.LENGTH_SHORT).show();
    }

    //check for the winner
    private boolean CheckWin() {
        String[][] text = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                text[i][j] = btn[i][j].getText().toString();
            }
        }

        for (int i = 0; i < 3; i++) {
            if (text[i][0].equals(text[i][1]) && text[i][0].equals(text[i][2]) && !text[i][0].equals("")) {
                return true;
            }
        }

        if(text[0][0].equals(text[1][1]) && text[0][0].equals(text[2][2]) && !text[0][0].equals("")){
            return true;
        }

        if(text[0][2].equals(text[1][1]) && text[0][2].equals(text[2][0]) && !text[0][2].equals("")){
            return true;
        }
        return false;
    }
}