package com.github.olvmat.soundmatchcli.models;

public class Podcast extends Audio {
    private final int episode;

    public Podcast(
            String title,
            int duration,
            int totalReproductions,
            int likes,
            int episode
    ) {
        super(title, duration, totalReproductions, likes);
        this.episode = episode;
    }

    public int getEpisode() {
        return this.episode;
    }
}
