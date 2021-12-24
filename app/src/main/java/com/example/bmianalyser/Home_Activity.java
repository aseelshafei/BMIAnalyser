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
Button AddFood;
    Button AddRecord;
    Button ViewFood;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView=findViewById(R.id.rec);
        AddFood= findViewById(R.id.button28);
        AddRecord= findViewById(R.id.button29);
        ViewFood= findViewById(R.id.button30);
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
        AddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home_Activity.this, AddFood.class);
                startActivity(i);}
                });

                 AddRecord.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(Home_Activity.this, NewRecord.class);
                        startActivity(i);}
                        });

                        ViewFood.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent i = new Intent(Home_Activity.this, FoodList.class);
                                startActivity(i);
                            }
                        });
                            }}































