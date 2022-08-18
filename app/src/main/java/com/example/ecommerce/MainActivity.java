package com.example.ecommerce;



import static androidx.navigation.ActivityKt.findNavController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ecommerce.model.BoxAdapters;
import com.example.ecommerce.model.BoxTdAdapters;
import com.example.ecommerce.model.Controle;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    private Controle controle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomMenu = findViewById(R.id.bottomNavigationView3);
        NavController navController = findNavController(this, R.id.fragmentContainerView3);
        NavigationUI.setupWithNavController(bottomMenu, navController);
        controle = Controle.getInstance(null);



    }


}