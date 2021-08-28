package com.example.diamondhotels;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class signup extends Fragment {

    DBHelper helper;
    EditText edt3,edt4,edt5;
    Button btn11;
    //ListHelper list;


    public signup() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signup,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edt3 = view.findViewById(R.id.edt3);
        edt4 = view.findViewById(R.id.edt4);
        edt5 = view.findViewById(R.id.edt5);
        btn11 = view.findViewById(R.id.btn11);

        helper = new DBHelper(getContext());
        //list = new ListHelper();

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edt3.getText().toString();
                String pass = edt4.getText().toString();
                String pass2 = edt5.getText().toString();

                if (pass.equals(pass2)) {
                    helper.insertData(name,pass);
                    Toast.makeText(getActivity(), "Welcome to Diamond Hotels!!", Toast.LENGTH_SHORT).show();
                    edt3.setText("");
                    edt4.setText("");
                    edt5.setText("");
                } else
                {
                    Toast.makeText(getActivity(), "Your Passwords do not match.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}