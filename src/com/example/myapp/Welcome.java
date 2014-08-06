package com.example.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.*;

/**
 * Created by siyanda on 8/1/14.
 */
public class Welcome extends Activity implements View.OnClickListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        Button btnAboutME;
        Button btnSpecial;

        btnAboutME = (Button)findViewById(R.id.btnabout);
        btnSpecial = (Button)findViewById(R.id.btnspcial);

        btnAboutME.setOnClickListener(this);
        btnSpecial.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


        //Toast.makeText(getApplicationContext(),"HERE",Toast.LENGTH_LONG).show();
        if(view.getId()==R.id.btnabout)
        {

            Intent intent = new Intent(getApplicationContext(), AboutMe.class);
            startActivity(intent);
        }
        else if(view.getId()== R.id.btnspcial)
        {
            //Toast.makeText(getApplicationContext(),"HER......E",Toast.LENGTH_LONG).show();
             Intent intent = new Intent(getApplicationContext(), Special.class);
             startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.contact:
                Intent intent = new Intent(getApplicationContext(),Add_Contact.class);
                startActivity(intent);
                return true;

            case R.id.help:
                Intent intent1 = new Intent(getApplicationContext(), Help.class);
                startActivity(intent1);
                return true;

            case R.id.action_search:
                Toast.makeText(getApplicationContext(),"Clicked on search icon", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_location:
                Toast.makeText(getApplicationContext(),"Clicked on Location icon", Toast.LENGTH_LONG).show();
                return true;
            case  R.id.action_refresh:
                Toast.makeText(getApplicationContext(),"Clicked on refresh icon", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}