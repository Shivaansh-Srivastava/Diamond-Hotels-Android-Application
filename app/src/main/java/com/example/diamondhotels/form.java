package com.example.diamondhotels;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class form extends AppCompatActivity {

    EditText edt6,edt7,edt8,edt9;
    Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Customer customer;
        customer = (Customer) getIntent().getSerializableExtra("Customer");

        edt6 = findViewById(R.id.edt6);
        edt7 = findViewById(R.id.edt7);
        edt8 = findViewById(R.id.edt8);
        edt9 = findViewById(R.id.edt9);
        btn12 = findViewById(R.id.btn12);

        edt6.setText(customer.getfName());
        edt8.setText(customer.getrType());




        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                customer.setPhn(edt7.getText().toString());
                customer.setStay(Integer.parseInt(edt9.getText().toString()));
                BottomSheetDialog bottomSheet = new BottomSheetDialog();
                bottomSheet.show(getSupportFragmentManager(),"FormBottomSheet");
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(form.this);
        builder.setMessage("Do you want to quit the booking?");
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
