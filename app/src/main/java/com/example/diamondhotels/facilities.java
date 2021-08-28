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
import android.widget.TextView;

public class facilities extends Fragment {
    Button btn5,btn6,btn7,btn8;
    TextView txtView20;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_facilities,container,false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        txtView20 = view.findViewById(R.id.txtView20);
        Intent intent = getActivity().getIntent();
        Customer customer = (Customer) intent.getSerializableExtra("Customer");

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setFacility("The Mandarin");
                BottomSheetDialog2 bottomSheetDialog2 = new BottomSheetDialog2();
                bottomSheetDialog2.show(getActivity().getSupportFragmentManager(),"FacilitiesBottomSheet");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setFacility("Rose Cafe");
                BottomSheetDialog2 bottomSheetDialog2 = new BottomSheetDialog2();
                bottomSheetDialog2.show(getActivity().getSupportFragmentManager(),"FacilitiesBottomSheet");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setFacility("Conference Room 1");
                BottomSheetDialog2 bottomSheetDialog2 = new BottomSheetDialog2();
                bottomSheetDialog2.show(getActivity().getSupportFragmentManager(),"FacilitiesBottomSheet");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customer.setFacility("Conference Room 2");
                BottomSheetDialog2 bottomSheetDialog2 = new BottomSheetDialog2();
                bottomSheetDialog2.show(getActivity().getSupportFragmentManager(),"FacilitiesBottomSheet");
            }
        });

    }
}