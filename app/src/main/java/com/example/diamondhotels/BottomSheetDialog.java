package com.example.diamondhotels;

import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog extends BottomSheetDialogFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_layout, container, false);
        Button btn13 = view.findViewById(R.id.btn13);
        Intent intent = getActivity().getIntent();
        Customer customer = (Customer) intent.getSerializableExtra("Customer");

        TextView txtView18 = view.findViewById(R.id.txtView18);
        int amount = customer.bill_generator_room();
        txtView18.setText("$"+Integer.toString(amount));

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Room Confirmed.", Toast.LENGTH_SHORT).show();
                dismiss();
                Intent intent1 = new Intent(getActivity(),loginClass.class);
                startActivity(intent1);
            }
        });
        return view;
    }
}
