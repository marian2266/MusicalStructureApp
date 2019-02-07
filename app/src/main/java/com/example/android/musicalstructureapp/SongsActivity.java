package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Black Panther", "Kendrick Lamar"));
        songs.add(new Song("All the Stars", "Kendrick Lamar"));
        songs.add(new Song("King's Dead", "Kendrick Lamar"));
        songs.add(new Song("Pray for Me", "Kendrick Lamar"));
        songs.add(new Song("Jungle", "Jimi Hendrix"));
        songs.add(new Song("Power of Soul", "Jimi Hendrix"));
        songs.add(new Song("The Miracle", "Queen "));
        songs.add(new Song("The Invisible Man", "Queen "));


        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent(SongsActivity.this, DetailedActivity.class);

                TextView nameLayout = v.findViewById(R.id.song_name);
                String songname = nameLayout.getText().toString();

                TextView authorLayout = v.findViewById(R.id.song_author);
                String author = authorLayout.getText().toString();

                Bundle songBundle = new Bundle();
                songBundle.putString(Constants.SONG_NAME, songname);
                songBundle.putString(Constants.SONG_AUTH, author);
                intent.putExtras(songBundle);


                startActivity(intent);
            }
        });
    }
}
