package com.github.olvmat.soundmatchcli.models;

public abstract class Audio {
    private final String title;
    private final int duration;
    private final int totalReproductions;
    private int likes;

    public Audio(
            String title,
            int duration,
            int totalReproductions
    ) {
        this.title = title;
        this.duration = duration;
        this.totalReproductions = totalReproductions;
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
}
