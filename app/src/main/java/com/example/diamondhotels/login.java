package com.example.diamondhotels;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class login extends Fragment {

    EditText edt1,edt2;
    Button btn9,btn10;
    DBHelper helper;
    //ListHelper list;
    Customer customer;

    public login() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edt1 = view.findViewById(R.id.edt1);
        edt2 = view.findViewById(R.id.edt2);
        btn9 = view.findViewById(R.id.btn9);
        btn10= view.findViewById(R.id.btn10);
        helper = new DBHelper(getContext());
        //list = new ListHelper();




        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean verify = helper.checkusernamepassword(edt1.getText().toString(),edt2.getText().toString());

                if(verify==true)
                {
                    Intent i = new Intent(getActivity(),SecondActivity.class);
                    customer = new Customer(edt1.getText().toString(),edt2.getText().toString());
                    i.putExtra("Customer",customer);
                    startActivity(i);
                 }
                else
                {
                    Toast.makeText(getContext(),"Please Enter Correct Credentials.", Toast.LENGTH_SHORT).show();
                }

                }
        });


        }


}
