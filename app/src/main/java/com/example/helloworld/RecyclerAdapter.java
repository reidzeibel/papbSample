package com.example.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class RecyclerAdapter
        extends RecyclerView.Adapter<RecyclerViewHolder> {

    List<RecyclerItem> list;

    public RecyclerAdapter(List<RecyclerItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout, viewGroup, false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewHolder recyclerViewHolder, int position) {
       //Sambungkan antara Data dengan ViewHolder
        final RecyclerItem item = list.get(position);

        final Context context = recyclerViewHolder.itemView.getContext();

        recyclerViewHolder.nama.setText(item.nama);
        recyclerViewHolder.nim.setText(item.nim);

        recyclerViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", item.nama);
                intent.putExtra("nim", item.nim);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
