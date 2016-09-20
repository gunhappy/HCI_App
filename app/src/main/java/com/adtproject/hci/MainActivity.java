package com.adtproject.hci;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.icon1) ImageView icon1;
    @BindView(R.id.icon2) ImageView icon2;
    @BindView(R.id.icon3) ImageView icon3;
    @BindView(R.id.icon4) ImageView icon4;
    @BindView(R.id.icon5) ImageView icon5;
    @BindView(R.id.icon6) ImageView icon6;

    GridLayout gridLayout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initComponents();
    }

    private void initComponents(){

        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,codingTab.class);
                startActivity(intent);
//                Fragment codeFragment = new codingFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.mainlayout,codeFragment).commit();
            }
        });

        icon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment codeFragment = new codingFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.mainlayout,codeFragment).commit();
                Intent intent = new Intent(MainActivity.this,codingTab.class);
                startActivity(intent);
            }
        });


        icon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment codeFragment = new codingFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.mainlayout,codeFragment).commit();
                Intent intent = new Intent(MainActivity.this,codingTab.class);
                startActivity(intent);
            }
        });


        icon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment codeFragment = new codingFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.mainlayout,codeFragment).commit();
                Intent intent = new Intent(MainActivity.this,codingTab.class);
                startActivity(intent);
            }
        });


        icon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment codeFragment = new codingFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.mainlayout,codeFragment).commit();
                Intent intent = new Intent(MainActivity.this,codingTab.class);
                startActivity(intent);
            }
        });


        icon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment codeFragment = new codingFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.mainlayout,codeFragment).commit();
                Intent intent = new Intent(MainActivity.this,codingTab.class);
                startActivity(intent);
            }
        });


    }
}
