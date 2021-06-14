package com.example.spy;

public class MusicFiles {
    public String getTitle;
    private String path;
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String id;

public MusicFiles(String path, String title, String artist, String album, String duration, String id) {
    this.path = path;
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.duration = duration;
    this.id = this.id;
}

   public String getPath() {
    return path;
   }

   public void setPath(String path) {
    this.path = path;
   }

   public String getTitle() {
    return title;
   }

   public void setTitle(String title) {
    this.title = title;
   }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = title;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
