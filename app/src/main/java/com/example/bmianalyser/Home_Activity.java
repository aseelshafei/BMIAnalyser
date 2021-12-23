package com.example.bmianalyser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Home_Activity<Food> extends AppCompatActivity {
RecyclerView recyclerView;
Button button28;
    Button button29;
    Button button30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button28= findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Activity.this, AddFood.class);
                startActivity(i);

                button29= findViewById(R.id.button29);
                button29.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Home_Activity.this, NewRecord.class);
                        startActivity(i);
                        button30= findViewById(R.id.button30);
                        button30.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent i = new Intent(Home_Activity.this, FoodList.class);
                                startActivity(i);


            }
        });

        recyclerView=findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<bmiModel> list=new ArrayList<>();
        list.add(new bmiModel("100","200","300"));
        list.add(new bmiModel("100","200","300"));
        list.add(new bmiModel("100","200","300"));
        list.add(new bmiModel("100","200","300"));
        list.add(new bmiModel("100","200","300"));
BMI_Recod_Adapter adapter=new BMI_Recod_Adapter(list,this);
        recyclerView.setAdapter(adapter);

    }
});}});}}






















