package com.example.schoollaptop5.devrequest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private static TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      // OnClickButtonListener();
    }

    public void klik(View view) {
        button = (TextView) findViewById(R.id.editText);
        // check login
        Intent intent = new Intent("com.example.schoollaptop5.devrequest.MainActivity");
        startActivity(intent);



    }
}
