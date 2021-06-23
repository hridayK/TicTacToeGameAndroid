package com.example.tictactoe;

import android.widget.Button;
import android.widget.TextView;

public class Logic {

    boolean isWin = false;

    //horizontal check
    public boolean check(Button btn[]){
        for(int i=0;i<9;i+=3){
            for(int j=i;j<i+3;j++){
                if(btn[j].getText().toString()=="X")
                    isWin=true;
                else{
                    isWin=false;
                    break;
                }
            }
            for(int k=i;k<i+3;k++){
                if(btn[k].getText().toString()=="X")
                    isWin=true;
                else{
                    isWin=false;
                    break;
                }
            }
            if (isWin==true)
                break;
        }

        //diagonal check
        if(btn[0].getText().toString()==btn[4].getText().toString() && btn[0].getText().toString() == btn[8].getText().toString() && (btn[0].getText().toString() == "X" || btn[0].getText().toString()=="O"))
            isWin=true;
        if(btn[2].getText().toString()==btn[4].getText().toString() && btn[2].getText().toString() == btn[6].getText().toString() && (btn[2].getText().toString() == "X" || btn[2].getText().toString()=="O"))
            isWin=true;

        //vertical check
        

        return isWin;
    }


}
