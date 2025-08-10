package com.github.olvmat.soundmatchcli.models;

public class Podcast extends Audio {
    private final int episode;

    public Podcast(
            String title,
            int duration,
            int episode
    ) {
        super(title, duration);
        this.episode = episode;
    }

    public int getEpisode() {
        return this.episode;
    }

    @Override
    public void play() {
        System.out.println("Playing Podcast " + this.getTitle() + "...");
        this.totalReproductions ++;
    }
}
