package com.example.shara.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BluffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitycategory);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new BluffFragment())
                .commit();
    }
}
