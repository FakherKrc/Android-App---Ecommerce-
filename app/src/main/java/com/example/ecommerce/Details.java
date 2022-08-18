package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    public void openSellerProfil(View view) {
        Intent intent = new Intent(this, profilseller.class);
        startActivity(intent);
    }

    public void BacktoActivity(View view) {
        onBackPressed();
    }
}