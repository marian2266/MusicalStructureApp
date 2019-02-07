package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {
    private String songname;
    private String auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.detail_screen);


        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            songname = extras.getString(Constants.SONG_NAME);
            auth = extras.getString(Constants.SONG_AUTH);
        }

        TextView song2 = (TextView) findViewById(R.id.song_name2);
        song2.setText(songname);

        TextView auth2 = (TextView) findViewById(R.id.song_author2);
        auth2.setText(auth);

    }
}