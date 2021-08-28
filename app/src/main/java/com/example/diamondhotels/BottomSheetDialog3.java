package com.example.diamondhotels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog3 extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.bottom_sheet_3,container,false);

        EditText edt10 = view.findViewById(R.id.edt10);
        Button btn15 = view.findViewById(R.id.btn15);

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Query Submitted.", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
        return view;
    }
}
