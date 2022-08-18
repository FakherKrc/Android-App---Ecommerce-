package com.example.ecommerce.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerce.R;

public class BoxSellerAdapter extends RecyclerView.Adapter<BoxSellerAdapter.BoxHolder> {
    private Context context;
    private LayoutInflater mInflater;
    private View mView;

    public BoxSellerAdapter(Context context){
        this.context = context;
        mInflater = LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public BoxSellerAdapter.BoxHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mView = mInflater.inflate(R.layout.box_item2, parent, false);
        return new BoxHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull BoxSellerAdapter.BoxHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class BoxHolder extends RecyclerView.ViewHolder {
        TextView mTextCat;
        TextView mTextDescription;
        TextView mTextPrice;
        ImageView mImgView;
        public BoxHolder(@NonNull View itemView) {
            super(itemView);
            mTextCat= itemView.findViewById(R.id.txtMainBoxProduct);
            mTextDescription = itemView.findViewById(R.id.txtDescription);
            mTextPrice = itemView.findViewById(R.id.txtPrice);
        }
    }
}
