package com.example.ecommerce.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.R;

public class BoxTdAdapters extends RecyclerView.Adapter<BoxTdAdapters.BoxHolder> {
    private LayoutInflater mInflater;
    private View itemView;


    public BoxTdAdapters(Context context) {
        this.mInflater = LayoutInflater.from(context);


    }

    @NonNull
    @Override
    public BoxHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView = mInflater.inflate(R.layout.shape,parent, false);
        return new BoxHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BoxHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 3;
    }

    class BoxHolder extends RecyclerView.ViewHolder {
        TextView boxContainer;

        public BoxHolder(@NonNull View itemView) {
            super(itemView);
            this.boxContainer = itemView.findViewById(R.id.box_container);

        }
    }


}
