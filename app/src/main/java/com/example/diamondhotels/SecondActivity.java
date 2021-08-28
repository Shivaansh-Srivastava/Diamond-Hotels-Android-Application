package com.example.diamondhotels;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView txtView2;
    Spinner spinner1;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Customer customer = (Customer) getIntent().getSerializableExtra("Customer");


        tabLayout = findViewById(R.id.tbl1);
        viewPager = findViewById(R.id.viewpager);
        spinner1 = findViewById(R.id.spinner1);
        txtView2 = findViewById(R.id.txtView2);
        txtView2.setText(customer.fName);
        String[] help={"Select","Help","FAQ","Contact Us"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,help);
        spinner1.setAdapter(ad);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(help[position].equals("Help"))
                {
                    BottomSheetDialog3 bottomSheetDialog3 = new BottomSheetDialog3();
                    bottomSheetDialog3.show(getSupportFragmentManager(),"HelpFragment");
                }
                if(help[position].equals("FAQ"))
                {
                    BottomSheetDialog4 bottomSheetDialog4 = new BottomSheetDialog4();
                    bottomSheetDialog4.show(getSupportFragmentManager(),"HelpFragment");
                }
                if(help[position].equals("Contact Us"))
                {
                    BottomSheetClass5 bottomSheetClass5 = new BottomSheetClass5();
                    bottomSheetClass5.show(getSupportFragmentManager(),"HelpFragment");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.add(new rooms(),"Rooms");
        viewPagerAdapter.add(new facilities(),"Facilities");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(SecondActivity.this);
        builder.setMessage("Do you want to log out?");
        builder.setTitle("Alert");
        builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(getApplicationContext(),loginClass.class);
                startActivity(i);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
