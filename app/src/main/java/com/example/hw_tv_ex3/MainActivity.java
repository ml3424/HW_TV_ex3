package com.example.hw_tv_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tV;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
    }

    public void click(View view) {
        counter ++;
        if(counter <= 6)
        {
            tV.setTextColor(Color.GREEN);
            tV.setText("This is a click number: " + counter);
        }
        else
        {
            counter = 0;
            tV.setTextColor(Color.RED);
            tV.setTextSize(30);
            tV.setText("Enough to click. Go to new start!");
        }
    }
}