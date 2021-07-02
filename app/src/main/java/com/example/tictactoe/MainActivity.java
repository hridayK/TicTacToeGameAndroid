package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

    //all the buttons
    public Button fields[] = new Button[9];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view){
        
    }
}