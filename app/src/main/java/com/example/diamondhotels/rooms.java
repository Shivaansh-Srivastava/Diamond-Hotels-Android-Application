package com.example.diamondhotels;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class rooms extends Fragment {
    Button btn1,btn2,btn3,btn4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rooms,container,false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Customer customer;
        Intent i = getActivity().getIntent();
        customer = (Customer) i.getSerializableExtra("Customer");

        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setrType("Suite");
                customer.setCost(200);
                Intent intent = new Intent(getActivity(),form.class);
                intent.putExtra("Customer",customer);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setrType("Business Suite");
                customer.setCost(300);
                Intent intent = new Intent(getActivity(),form.class);
                intent.putExtra("Customer",customer);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setrType("Executive Suite");
                customer.setCost(400);
                Intent intent = new Intent(getActivity(),form.class);
                intent.putExtra("Customer",customer);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setrType("Presidential Suite");
                customer.setCost(500);
                Intent intent = new Intent(getActivity(),form.class);
                intent.putExtra("Customer",customer);
                startActivity(intent);
            }
        });

    }
}