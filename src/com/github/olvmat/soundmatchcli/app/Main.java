package com.github.olvmat.soundmatchcli.app;

import com.github.olvmat.soundmatchcli.models.Music;
import com.github.olvmat.soundmatchcli.models.Podcast;
import com.github.olvmat.soundmatchcli.utils.console.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        ConsoleUtils.display("Sound Match\n");
        String menu = """
                Menu
                1 - Musics
                2 - Podcasts
                3 - Exit
                """;
        while (true) {
            ConsoleUtils.display(menu);
            ConsoleUtils.display("Option: ");
            int option = ConsoleUtils.readInt();
            switch (option) {
                case 1:
                    System.out.println("Musics");
                    Music music = new Music(
                            "Bad Liar",
                            5,
                            "Imagine Dragons"
                    );
                    music.like();
                    ConsoleUtils.display(
                            "Music: " + music.getTitle() + "\n" +
                                    "Singer: " + music.getSinger() + "\n" +
                                    "Duration: " + music.getDuration() + " Minutes" + "\n" +
                                    "Reproductions: " + music.getTotalReproductions() + "\n" +
                                    "Likes: " + music.getLikes() + "\n" +
                                    "Classification: " + music.getClassification() + " Stars" + "\n"
                            );
                    music.play();
                    break;
                case 2:
                    System.out.println("Podcasts");
                    Podcast podcast = new Podcast(
                            "Serial",
                            60,
                            12
                    );
                    podcast.like();
                    ConsoleUtils.display(
                            "Podcast: " + podcast.getTitle() + "\n" +
                                    "Episode: " + podcast.getEpisode() + "\n" +
                                    "Duration: " + podcast.getDuration() + " Minutes" + "\n" +
                                    "Reproductions: " + podcast.getTotalReproductions() + "\n" +
                                    "Likes: " + podcast.getLikes() + "\n" +
                                    "Classification: " + podcast.getClassification() + " Stars" + "\n"
                            );
                    podcast.play();
                    break;
                case 3:
                    System.out.println("Leaving...");
                    return;
            }
        }
    }
}
