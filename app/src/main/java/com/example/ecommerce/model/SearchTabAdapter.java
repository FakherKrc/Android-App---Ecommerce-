package com.example.ecommerce.model;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SearchTabAdapter extends FragmentStateAdapter {
    private Context context;

    public SearchTabAdapter(@NonNull Fragment fragment, Context context) {
        super(fragment);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0: return new SearchBox(context);
            case 1: return new SearchMember(context);
            default: return new SearchBox(context);
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
