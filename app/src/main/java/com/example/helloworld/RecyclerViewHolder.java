package com.example.helloworld;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView nama;
    TextView nim;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        nama = itemView.findViewById(R.id.title);
        nim = itemView.findViewById(R.id.nim);
    }
}
