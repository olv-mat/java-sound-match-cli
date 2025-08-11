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

    public int getClassification() {
        int reproductions = this.totalReproductions;
        if (reproductions <= 1000) {
            return 1;
        } else if (reproductions <= 10000) {
            return 2;
        } else if (reproductions <= 100000) {
            return 3;
        } else if (reproductions <= 1000000) {
            return 4;
        } else {
            return 5;
        }
    }
}
