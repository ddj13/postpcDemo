package com.selfChat.ex5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FishingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fishing_screen);
    }

    @Override
    public void onBackPressed(){
        finish();
    }



}
