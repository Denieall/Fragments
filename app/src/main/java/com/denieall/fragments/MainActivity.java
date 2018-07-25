package com.denieall.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createQuote(String top, String bottom) {

        // Getting the fragment
        BottomSectionFragment bottomSectionFragment = (BottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomSectionFragment.setText(top, bottom);

    }
}
