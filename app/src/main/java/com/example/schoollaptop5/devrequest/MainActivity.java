package com.example.schoollaptop5.devrequest;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button B1;
    EditText T1;
    TextView V1;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mp = MediaPlayer.create(this, R.raw.era);
        okButton();
    }

    public void openActivity (){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void okButton (){
        B1 = (Button) this.findViewById(R.id.button);
        V1 = (TextView) this.findViewById(R.id.textView);
        B1 = (Button) this.findViewById(R.id.button);
        B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                V1.setTextColor(Color.BLUE);
                mp.start();
                mp.seekTo(0);
                openActivity();
                T1 = (EditText) findViewById(R.id.editText);
                T1.getText().toString();
            }
        });
    }


}