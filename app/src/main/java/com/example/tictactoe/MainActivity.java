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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int index=0;
        for(int id:IDS){
            fields[index] = (Button) findViewById(id);
            index++;
        }
    }

    public void click00(View view) {

    }

    public void click01(View view) {

    }

    public void click02(View view) {

    }

    public void click10(View view) {

    }

    public void click11(View view) {

    }

    public void click12(View view) {

    }

    public void click20(View view) {

    }

    public void click21(View view) {

    }

    public void click22(View view) {

    }
}