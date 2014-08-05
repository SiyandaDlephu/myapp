package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by siyanda on 8/1/14.
 */
public class AboutMe extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {

        Button btnLogout;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutme);

        btnLogout = (Button)findViewById(R.id.btnlogout);
        btnLogout.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        //btnLogout = (Button)findViewById(R.id.btnlogout);
        if (view.getId() == R.id.btnlogout)
        {
            Intent intent = new Intent(getApplicationContext(), Welcome.class);

            startActivity(intent);
        }
    }
}