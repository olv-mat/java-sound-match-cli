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

    public int getClassification() {
        int likes = this.likes;
        if (likes <= 25) {
            return 1;
        } else if (likes <= 50) {
            return 2;
        } else if (likes <= 75) {
            return 3;
        } else if (likes <= 100) {
            return 4;
        } else {
            return 5;
        }
    }
}
