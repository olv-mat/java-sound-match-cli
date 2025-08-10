package com.github.olvmat.soundmatchcli.models;

public class Music extends Audio {
    private final String album;

    public Music(
            String title,
            int duration,
            int totalReproductions,
            int likes,
            String album
    ) {
        super(title, duration, totalReproductions, likes);
        this.album = album;
    }

    public String getAlbum() {
        return this.album;
    }
}
