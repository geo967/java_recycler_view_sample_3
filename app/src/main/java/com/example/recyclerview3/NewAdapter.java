package com.example.recyclerview3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.newHolder> {
    Context context;
    List<Names> list;

    NewAdapter(List<Names> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public NewAdapter.newHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent, false);
        return new newHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewAdapter.newHolder holder, int position) {
        holder.text.setText(list.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public static class newHolder extends RecyclerView.ViewHolder {
        TextView text;

        public newHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
        }
    }
}
