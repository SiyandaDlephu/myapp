package com.example.myapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.*;

/**
 * Created by siyanda on 7/31/14.
 */
public class helloworld extends Activity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hello_world);
        Button btnSave;
        Button btnClear;


        btnSave = (Button)findViewById(R.id.btnsave);
        btnClear = (Button)findViewById(R.id.btnclear);

        btnSave.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        RadioButton rbnCheck;
        EditText txtName =(EditText)findViewById(R.id.txtname);
        EditText txtPassword = (EditText)findViewById(R.id.txtpassword);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        if(view.getId() == R.id.btnsave)
        {

                if (txtName.getText().toString().equalsIgnoreCase("siyanda" ) && (txtPassword.getText().toString().equalsIgnoreCase("s"))) {
                    Toast.makeText(context, txtName.getText().toString() + txtPassword.getText().toString(), duration).show();

                    Intent intent = new Intent(this, Welcome.class);
                    startActivity(intent);

                }
            else if (txtPassword.length()==0 || txtName.length()==0)
                {
                    Toast.makeText(context,"Field cannot be empty", duration).show();
                    txtName.getText().clear();
                    txtPassword.getText().clear();
                }
            else if(!txtName.getText().toString().equalsIgnoreCase("siyanda" ) && (!txtPassword.getText().toString().equalsIgnoreCase("s")))
                {
                    Toast.makeText(context,"Access denied ", duration).show();
                    txtName.getText().clear();
                    txtPassword.getText().clear();
                }
        }
        else if(view.getId()== R.id.btnclear)
        {
            txtName.getText().clear();
            txtPassword.getText().clear();
        }

    }


}