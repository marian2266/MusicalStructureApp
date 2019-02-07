package com.example.android.musicalstructureapp;

/**
 * {@link Song} represents a song
 * It contains a song name & it's author
 */
public class Song {

    //Song name
    private String mSongName;

    //Song author
    private String mSongAuthor;

    /**
     * Create a new Album object.
     *
     * @param songName   is the song name
     * @param songAuthor is the song author
     */
    public Song(String songName, String songAuthor) {
        mSongName = songName;
        mSongAuthor = songAuthor;
    }

    /**
     * Get the song name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the song author
     */
    public String getSongAuthor() {
        return mSongAuthor;
    }

}