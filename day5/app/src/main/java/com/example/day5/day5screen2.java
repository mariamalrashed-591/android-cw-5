package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class day5screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5screen2);


        final TextView name = findViewById(R.id.namesent);
        Bundle x = getIntent().getExtras();//writing this so that we can except the info we sent
        name.setText (x.getString("name"));


            }

    }
