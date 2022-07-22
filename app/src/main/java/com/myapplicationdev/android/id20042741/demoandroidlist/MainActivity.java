package com.myapplicationdev.android.id20042741.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> lvAL;
    String[] lvArray;
    ArrayAdapter<String> lvAA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.demoLvID);

        // Can use a static array to bind to the array adapter
        lvArray = new String[] {"Pie - 9.0", "Oreo - 8.0 - 8.1",
                                "Nougat - 7.0 - 7.1.2", "Marshmellow - 6.0 - 6.01",
                                "Lollipop - 5.0 - 5.1.1", "KitKat - 4.4 - 4.4.4",
                                "Jelly Bean - 4.1 - 4.3.1"};



        // Can also use an array list to bind to the array adapter
        lvAL = new ArrayList<String>();
        lvAL.addAll(Arrays.asList(lvArray)); // just converts the above array into an arraylist

        // can be this
        //lvAA = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lvArray);

        // or this
        lvAA = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lvAL);

        lv.setAdapter(lvAA);




    }
}