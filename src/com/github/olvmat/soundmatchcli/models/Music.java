package com.github.olvmat.soundmatchcli.models;

public class Music extends Audio {
    private final String album;

    public Music(
            String title,
            int duration,
            int totalReproductions,
            String album
    ) {
        super(title, duration, totalReproductions);
        this.album = album;
    }

    public String getAlbum() {
        return this.album;
    }

    @Override
    public void play() {
        System.out.println("Playing Music" + this.getTitle() + "...");;
    }
}
