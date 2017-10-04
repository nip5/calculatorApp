package com.example.nathan_mccauslin.calculatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Nate on 10/2/2017.
 */

public class History extends AppCompatActivity {
    public Bundle getBundle = null;
    private String historyTxt = "";
    private TextView historyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getBundle = this.getIntent().getExtras();
        historyTxt = getBundle.getString("history");
        historyPage = (TextView) findViewById(R.id.historyPg);
        historyPage.setText(historyTxt);
    }
}