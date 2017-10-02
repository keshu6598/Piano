package com.example.user.piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b1=(Button)findViewById(R.id.bt1);
        Button b2=(Button)findViewById(R.id.bt2);
        Button b3=(Button)findViewById(R.id.bt3);
        Button b4=(Button)findViewById(R.id.bt4);
        Button b5=(Button)findViewById(R.id.bt5);
        Button b6=(Button)findViewById(R.id.bt6);
        Button b7=(Button)findViewById(R.id.bt7);
        Button b8=(Button)findViewById(R.id.bt8);


        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.c);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.d);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.e);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.f);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.g);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.a);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.b);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.c);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
            }
        });
    }

}
