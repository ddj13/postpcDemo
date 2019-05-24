package com.selfChat.ex5;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String DIGITS_READ_MSG="you have entered: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tapTextOnClick(View view) {
        Intent intent=new Intent(this,DigitsReadScreen.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                String res=data.getStringExtra(DigitsReadScreen.DIG_RES_KEY);
                ((TextView)findViewById(R.id.tapText)).setText((DIGITS_READ_MSG+res));
            }
        }
    }

    public void onGoFishClick(View view) {
        Intent intent=new Intent(this,FishingScreen.class);
        startActivity(intent);
    }
}
