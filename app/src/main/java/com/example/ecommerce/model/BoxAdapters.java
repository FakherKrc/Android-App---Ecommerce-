package com.example.ecommerce.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.Details;
import com.example.ecommerce.MainActivity;
import com.example.ecommerce.R;

public class BoxAdapters extends RecyclerView.Adapter<BoxAdapters.BoxHolder> {

    private LayoutInflater mInflater;
    private View mView;
    public static Context context;


    public BoxAdapters(Context context){
       mInflater = LayoutInflater.from(context);
       this.context = context;


    }
    @NonNull
    @Override
    public BoxAdapters.BoxHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mView = mInflater.inflate(R.layout.box_item,parent, false);
        mView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(context.getApplicationContext(), Details.class);
                context.startActivity(intent);

            }
        });
        return new BoxHolder(mView);

    }

    @Override
    public void onBindViewHolder(@NonNull BoxAdapters.BoxHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class BoxHolder extends RecyclerView.ViewHolder{

        TextView txtDescription;
        TextView txtCat;
        TextView txtPrice;
        TextView txtSell;
        ImageView imgBox;
        public BoxHolder(@NonNull View itemView) {
            super(itemView);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            txtCat = itemView.findViewById(R.id.txtCat);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtSell = itemView.findViewById(R.id.txtSell);


        }


    }



}
