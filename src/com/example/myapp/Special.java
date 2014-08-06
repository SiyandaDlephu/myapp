package com.example.myapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * Created by siyanda on 8/1/14.
 */
public class Special extends Activity implements View.OnClickListener{

    ImageView image;
    Button btnIcon;
    Button btnLogout;
    Button btnfile;
    Button btnplaysong,btnpause;

    MediaPlayer song,song1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.special);

        image = (ImageView)findViewById(R.id.imageView);
        btnIcon = (Button)findViewById(R.id.btnicon);
        btnfile = (Button)findViewById(R.id.btnreadfile);
        btnplaysong = (Button)findViewById(R.id.btnSong);
        btnpause = (Button)findViewById(R.id.btnpause);

        btnIcon.setOnClickListener(this);
//        btnLogout.setOnClickListener(this);
        btnfile.setOnClickListener(this);
        btnplaysong.setOnClickListener(this);
        btnpause.setOnClickListener(this);

        //song1 = MediaPlayer.create(Special.this, R.raw.noko);
        song = MediaPlayer.create(Special.this,R.raw.song );
    }

    public void onClick(View view)
    {
        btnLogout = (Button)findViewById(R.id.btnlogout);
        if (view.getId() == R.id.btnlogout)
        {
            Intent intent = new Intent(getApplicationContext(), helloworld.class);
            startActivity(intent);
        }
        else if (view.getId()== R.id.btnicon)
        {
            image.setImageResource(R.drawable.icon);
            image.setImageResource(R.drawable.index);
            image.setImageResource(R.drawable.images);
        }
        else if(view.getId()==R.id.btnreadfile)
        {
            InputStream inputStream = getResources().openRawResource(R.raw.testfile);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String data = null;

            try
            {
                while ((data=br.readLine())!=null)
                {
                    Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else if(view.getId() ==R.id.btnSong)
        {
            //song = MediaPlayer.create(Special.this,R.raw.song );
           // song1 = MediaPlayer.create(Special.this, R.raw.noko);
            song.start();
        }
        else if(view.getId()==R.id.btnpause)
        {
            song.pause();
        }
    }

    public void onPause()
    {
        super.onPause();
        song.release();
        finish();
    }
}