package com.example.soundmash;

public class music {
    public music(String songName, String artist, int songs) {
        this.songName = songName;
        this.artist = artist;
        this.songs = songs;
    }

    private String songName;
    private String artist;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }

    private  int songs;

}
