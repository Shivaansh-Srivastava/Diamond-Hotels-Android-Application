package com.example.diamondhotels;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog2 extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_layout2,container,false);
        TextView txtView20 = view.findViewById(R.id.txtView20);
        Button btn14 = view.findViewById(R.id.btn14);
        Intent i = getActivity().getIntent();
        Customer customer= (Customer) i.getSerializableExtra("Customer");
        txtView20.setText(customer.getFacility());
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Service booked", Toast.LENGTH_SHORT).show();
                dismiss();
                Intent intent = new Intent(getActivity(),loginClass.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
