package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;


/**
 * Created by siyanda on 8/1/14.
 */
public class Special extends Activity implements View.OnClickListener{

    ImageView image;
    Button btnIcon;
    Button btnLogout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special);

        image = (ImageView)findViewById(R.id.imageView);
        btnIcon = (Button)findViewById(R.id.btnicon);

        btnIcon.setOnClickListener(this);
        btnLogout.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        btnLogout = (Button)findViewById(R.id.btnlogout);
        if (view.getId() == R.id.btnlogout)
        {
            Intent intent = new Intent(getApplicationContext(), helloworld.class);
            getApplicationContext().startActivity(intent);
        }
        else if (view.getId()== R.id.btnicon)
        {
            image.setImageResource(R.drawable.icon);
            image.setImageResource(R.drawable.index);
            image.setImageResource(R.drawable.images);
        }
    }
}