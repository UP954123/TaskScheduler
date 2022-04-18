package com.example.taskscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        TextView UserName = findViewById(R.id.username);
        TextView passWord = findViewById(R.id.password);
        MaterialButton logInButton = findViewById(R.id.loginbutton);
        logInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (UserName.getText().toString().equals("apollon") && passWord.getText().toString().equals("apollon")) {
                    Toast.makeText(SignInActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignInActivity.this,calendarView.class);
                    startActivity(intent);
                } else
                    Toast.makeText(SignInActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
            }
        });

        MaterialButton registerbutton = findViewById(R.id.signupbutton);
        registerbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this,RegistartionActivity.class);
                startActivity(intent);
            }
        });

    }



    }


