package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = findViewById(R.id.name);
        Button page1 = findViewById(R.id.button1);
        Button page2 = findViewById(R.id.button2);

        page1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("Mariam")){
                    //Toast.makeText(MainActivity.this,"TRUE", Toast.LENGTH_SHORT).show();
                    Intent nextpage = new Intent(MainActivity.this, day5screen2.class);
                    nextpage.putExtra("name",name.getText().toString());
                    //i.putExtra("name2", name.ge
                    startActivity(nextpage);
                }
                else {
                    //Toast.makeText(MainActivity.this,"Wrong Password or Username", Toast.LENGTH_SHORT).show();
                }
            }
        });

        page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (name.getText().toString().equals("Mariam")){
                    //Toast.makeText(MainActivity.this,"TRUE", Toast.LENGTH_SHORT).show();
                    Intent nextpage = new Intent(MainActivity.this, day5screen3.class);
                    //nextpage.putExtra("name",name.getText().toString());
                    //i.putExtra("name2", name.ge
                    startActivity(nextpage);
                }
        });

    }
}