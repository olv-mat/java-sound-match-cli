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
        if (reproductions <= 100) {
            return 1;
        } else if (reproductions <= 200) {
            return 2;
        } else if (reproductions <= 300) {
            return 3;
        } else if (reproductions <= 400) {
            return 4;
        } else {
            return 5;
        }
    }
}
