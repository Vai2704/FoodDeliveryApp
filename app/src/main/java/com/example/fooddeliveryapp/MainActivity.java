package com.example.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login,registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To hide Action bar

         getSupportActionBar().hide();

         login = findViewById(R.id.loginbutton);
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this,Sigin_Activity.class);
                 startActivity(intent);
             }
         });
         registerButton = findViewById(R.id.registerButton);
         registerButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent2 = new Intent(MainActivity.this , Sign_Up_Activity.class);
                 startActivity(intent2);
             }
         });
    }
}