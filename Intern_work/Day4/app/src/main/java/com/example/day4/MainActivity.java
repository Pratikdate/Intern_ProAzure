package com.example.day4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textView;
    AppCompatButton button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);

        AppCompatButton button1=(AppCompatButton) findViewById(R.id.button2);
        button1.setOnClickListener(this);





    }



    @Override
    public void onClick(View v) {
        button1.setText("submited");
    }
}