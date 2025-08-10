package com.github.olvmat.soundmatchcli.models;

public abstract class Audio {
    private final String title;
    private final int duration;
    protected int totalReproductions;
    private int likes;

    public Audio(
            String title,
            int duration
    ) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getTotalReproductions() {
        return this.totalReproductions;
    }

    public int getLikes() {
        return this.likes;
    }

    public void like() {
        this.likes ++;
    }

    public void play() {
        System.out.println("Playing...");
        this.totalReproductions ++;
    }
}
