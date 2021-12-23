package com.example.bmianalyser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {
Button save_date;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        save_date= findViewById(R.id.button7);
        save_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(NextActivity.this, Home_Activity.class);
                startActivity(i);
            }
        });


    }
}