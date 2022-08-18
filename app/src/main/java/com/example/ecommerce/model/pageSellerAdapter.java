package com.example.ecommerce.model;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class pageSellerAdapter extends FragmentStateAdapter {
    private Context context;
    public pageSellerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, Context context) {
        super(fragmentManager, lifecycle);
        this.context = context;


    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0: return new sellerFragment1(context);

            case 1: return new sellerFragment2(context);

            case 2: return new sellerFragment3();

            default: return null;
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

