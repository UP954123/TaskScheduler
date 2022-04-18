package com.example.taskscheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.CalendarView;
import android.os.Bundle;

public class calendarView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);
        CalendarView calendarView = findViewById(R.id.calendar);
        long dateClicked;
        calendarView.setOnClickListener(new View.OnClickListener(){
// elaaaa
            @Override
            public void onClick(View view) {
                long dateClicked;
                dateClicked = calendarView.getDate();
                String date1 = String.valueOf(dateClicked);
                /*
                Intent intent = new Intent(RegistartionActivity.this,calendarView.class);
                intent.putExtra("datePassed",date1);
                startActivity(intent);
                */

            }
        });

    }
}