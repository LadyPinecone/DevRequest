package com.example.schoollaptop5.devrequest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by samantha on 3-6-2016.
 */
public class ListItemDetail extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        // Here we turn your string.xml in an array
        String[] myKeys = getResources().getStringArray(R.array.vragen);

        TextView myTextView = (TextView) findViewById(R.id.my_textview);
        myTextView.setText(myKeys[position]);


    }

}