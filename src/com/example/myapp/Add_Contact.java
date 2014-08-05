package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by siyanda on 8/5/14.
 */
public class Add_Contact extends Activity implements View.OnClickListener{

    EditText txtname, txtphonenumber, txtemail, txtaddress;
    Button btnsave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_contact);

        txtname = (EditText)findViewById(R.id.txtName);
        txtphonenumber = (EditText)findViewById(R.id.txtPhoneNumber);
        txtemail = (EditText)findViewById(R.id.txtEmail);
        txtaddress = (EditText)findViewById(R.id.txtAddress);
        btnsave = (Button)findViewById(R.id.btnSave);

        btnsave.setOnClickListener(this);
    }

    public void onClick(View view){

        if(view.getId() == R.id.btnSave)
        {
            Toast.makeText(getApplicationContext(), "contact saved",Toast.LENGTH_LONG).show();
        }
    }
}