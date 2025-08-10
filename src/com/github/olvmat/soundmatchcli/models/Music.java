package com.github.olvmat.soundmatchcli.models;

public class Music extends Audio {
    private final String singer;

    public Music(
            String title,
            int duration,
            String singer
    ) {
        super(title, duration);
        this.singer = singer;
    }

    public String getSinger() {
        return this.singer;
    }

    @Override
    public void play() {
        System.out.println("Playing Music " + this.getTitle() + "...");
        this.totalReproductions ++;
    }
}
