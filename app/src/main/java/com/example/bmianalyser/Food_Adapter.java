package com.example.bmianalyser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  Food_Adapter extends RecyclerView.Adapter<foodholder> {
    ArrayList<foodmodel> list;

    public Food_Adapter(ArrayList<foodmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;

    public Food_Adapter(ArrayList<foodmodel> list, View.OnClickListener onClickListener) {

    }

    @NonNull
    @Override
    public foodholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.foodactiv,parent,false);
        return new foodholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodholder holder, int position) {
        foodmodel model=list.get(position);
        holder.name.setText(model.getName());
        holder.cal.setText(model.getCal());
        holder.cato.setText(model.getCato());
        holder.img.setImageResource(model.getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();

    }
}
