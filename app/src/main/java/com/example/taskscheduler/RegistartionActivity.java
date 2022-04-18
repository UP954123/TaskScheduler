package com.example.taskscheduler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

public class RegistartionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registartion);
        TextView username = findViewById(R.id.regUsername);
        TextView password1 = findViewById(R.id.regPass1);
        TextView password2 = findViewById(R.id.regPass2);
        TextView email = findViewById(R.id.email);
        MaterialButton registerButton = findViewById(R.id.register);
        registerButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
               if (password1.getText().toString().equals(password2.getText().toString()) && !TextUtils.isEmpty(email.getText().toString()) &&  !TextUtils.isEmpty(username.getText().toString())) {
                   Toast.makeText(RegistartionActivity.this, "ACCOUNT CREATION SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegistartionActivity.this,calendarView.class);
                    startActivity(intent);
                } else
                    Toast.makeText(RegistartionActivity.this, "ALL FIELDS REQUIRED", Toast.LENGTH_SHORT).show();

            }
        });
    }
}