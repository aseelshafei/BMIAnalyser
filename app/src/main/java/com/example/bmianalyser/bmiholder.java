package com.example.bmianalyser;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class bmiholder extends RecyclerView.ViewHolder {
    TextView lenght,weight,state,date;


    public bmiholder(@NonNull View itemView) {
        super(itemView);
        lenght=itemView.findViewById(R.id.Length);
        weight=itemView.findViewById(R.id.textView42);
        state=itemView.findViewById(R.id.textView41);
        date=itemView.findViewById(R.id.textView43);

    }
}

