package com.selfChat.ex5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class DigitsReadScreen extends AppCompatActivity {
    private static final int DIGITS_READ_LEN=5;
    protected static final String DIG_RES_KEY="digit_read_results";
    private final TextWatcher mTextEditorWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            //stub
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if(s.length()==DIGITS_READ_LEN){
                Intent intent=new Intent();
                intent.putExtra(DIG_RES_KEY,s.toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
        //stub
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digits_read_screen);
        ((EditText)findViewById(R.id.inputDigits)).addTextChangedListener(mTextEditorWatcher);
    }
}
