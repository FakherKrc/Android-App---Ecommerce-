package com.example.ecommerce.model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.R;
import com.example.ecommerce.profilseller;

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.MemberHolder>{

    private View mView;
    private LayoutInflater layoutInflater;
    private Context context;

    public MemberAdapter(Context context){
        layoutInflater = LayoutInflater.from(context);
        this.context = context;


    }

    @NonNull
    @Override
    public MemberAdapter.MemberHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mView = layoutInflater.inflate(R.layout.member_item, parent, false);
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(context, profilseller.class);
                context.startActivity(intent);
            }
        });
        return new MemberHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull MemberAdapter.MemberHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MemberHolder extends RecyclerView.ViewHolder {
        public MemberHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
