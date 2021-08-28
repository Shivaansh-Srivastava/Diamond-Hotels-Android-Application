package com.example.diamondhotels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class loginClass extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        tabLayout = findViewById(R.id.tbl2);
        viewPager2 = findViewById(R.id.viewpager2);


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.add(new login(),"Login");
        viewPagerAdapter.add(new signup(),"Sign Up");

        viewPager2.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager2);


    }

}
