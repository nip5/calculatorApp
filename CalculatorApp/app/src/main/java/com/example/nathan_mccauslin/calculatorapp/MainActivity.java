package com.example.nathan_mccauslin.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bsh.EvalError;
import bsh.Interpreter;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;
    private Button negate;
    private Button modulous;
    private Button ans;
    private Button add;
    private TextView display;
    private String displayStr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
        display = (TextView) findViewById(R.id.display);
    }
    public void onClickListenerButton() {
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        clear = (Button) findViewById(R.id.reset);
        negate = (Button) findViewById(R.id.negate);
        modulous = (Button) findViewById(R.id.modulus);
        ans = (Button) findViewById(R.id.equals);
        add = (Button) findViewById(R.id.addition);
        one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "1";
                        display.setText(displayStr);
                    }
                });
        two.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "2";
                        display.setText(displayStr);
                    }
                });
        three.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "3";
                        display.setText(displayStr);
                    }
                });
        four.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "4";
                        display.setText(displayStr);
                    }
                });
        five.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "5";
                        display.setText(displayStr);
                    }
                });
        six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "6";
                        display.setText(displayStr);
                    }
                });
        seven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "7";
                        display.setText(displayStr);
                    }
                });
        eight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "8";
                        display.setText(displayStr);
                    }
                });
        nine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "9";
                        display.setText(displayStr);
                    }
                });
        zero.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "0";
                        display.setText(displayStr);
                    }
                });
        clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr = "";
                        display.setText(displayStr);
                    }
                });
        negate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr = "-" + displayStr;
                        display.setText(displayStr);
                    }
                });
        modulous.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "%";
                        display.setText(displayStr);
                    }
                });
        add.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        displayStr += "+";
                        display.setText(displayStr);
                    }
                });
        ans.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Interpreter interpreter = new Interpreter();
                        try {
                            interpreter.eval("result = " + displayStr);
                            displayStr = interpreter.get("result").toString();
                        }
                        catch (EvalError e){
                            displayStr = "err";
                        }
                        display.setText(displayStr);
                    }
                });
    }
}
