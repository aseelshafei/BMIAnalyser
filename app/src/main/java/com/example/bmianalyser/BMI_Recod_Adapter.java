package com.example.bmianalyser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BMI_Recod_Adapter extends RecyclerView.Adapter<bmiholder> {
    ArrayList<bmiModel> list;

    public BMI_Recod_Adapter(ArrayList<bmiModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;

    public BMI_Recod_Adapter(ArrayList<bmiModel> list, View.OnClickListener onClickListener) {

    }

    @NonNull
    @Override
    public bmiholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.table_record,parent,false);
        return new bmiholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bmiholder holder, int position) {
        bmiModel model=list.get(position);
        holder.lenght.setText(model.getLenght());
        holder.weight.setText(model.getWieght());
        holder.state.setText(model.getDate());
        holder.date.setText(model.getDate());

    }

    @Override
    public int getItemCount() {
        return list.size();

    }
}
