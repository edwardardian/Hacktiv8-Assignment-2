package com.example.instancestateexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button countButton;

    private TextView numberText;

    private int count;

    private EditText komentarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countButton = findViewById(R.id.countButton);
        numberText = findViewById(R.id.numberText);
        komentarText = findViewById(R.id.komentarText);


        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                numberText.setText(String.valueOf(count));
            }
        });
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("savedCount");
            numberText.setText(String.valueOf(count));
        }
    }

    public MainActivity() {
        super();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("savedCount", count);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }




}