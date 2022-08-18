package com.example.ecommerce.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.R;

import java.util.zip.Inflater;

public class AvisAdapter extends RecyclerView.Adapter<AvisAdapter.AvisHolder> {


    private View mView;
    private LayoutInflater mInflater;
    public AvisAdapter(Context context){
        mInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public AvisAdapter.AvisHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mView = mInflater.inflate(R.layout.avis_items, parent, false);
        return new AvisHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull AvisAdapter.AvisHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class AvisHolder extends RecyclerView.ViewHolder {
        public AvisHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
