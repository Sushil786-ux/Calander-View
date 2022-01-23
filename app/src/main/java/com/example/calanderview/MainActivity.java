package com.example.calanderview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CalendarView calendar;
    TextView date_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar=findViewById(R.id.calendar);
        date_view=findViewById(R.id.date_view);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date= dayOfMonth + "-" + (month + 1) + "-" + year ;
                date_view.setText(date);

            }
        });
    }
}