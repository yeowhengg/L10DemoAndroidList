package com.myapplicationdev.android.id20042741.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> lvAL;
    CustomAdapter customLvAA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.demoLvID);

        // Can also use an array list to bind to the array adapter
        lvAL = new ArrayList<AndroidVersion>();
        lvAL.add(new AndroidVersion("Pie", "9.0"));
        lvAL.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        lvAL.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));

        customLvAA = new CustomAdapter(this, R.layout.row, lvAL);
        lv.setAdapter(customLvAA);



    }
}