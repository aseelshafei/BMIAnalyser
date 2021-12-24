package com.example.bmianalyser;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class foodholder extends RecyclerView.ViewHolder {
    TextView  name,cal,cato;
    ImageView img;

    public foodholder(@NonNull View itemView) {
        super(itemView);
        name =itemView.findViewById(R.id.textView32);
        cal=itemView.findViewById(R.id.textView48);
        cato=itemView.findViewById(R.id.textView46);
        img=itemView.findViewById(R.id.ImageView);

    }
}


