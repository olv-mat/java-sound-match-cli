package com.github.olvmat.soundmatchcli.app;

import com.github.olvmat.soundmatchcli.models.Music;
import com.github.olvmat.soundmatchcli.models.Podcast;
import com.github.olvmat.soundmatchcli.utils.console.ConsoleUtils;
import com.github.olvmat.soundmatchcli.utils.recommendation.Favorites;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConsoleUtils.display("Sound Match\n");
        String menu = """
                Menu
                1 - Musics
                2 - Podcasts
                3 - Exit
                """;
        Random random = new Random();
        Favorites favorites = new Favorites();
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
                    for (int i = 0; i < random.nextInt(2000); i++) {
                        music.like();
                    }
                    for (int i = 0; i < random.nextInt(1000); i++) {
                        music.play();
                    }
                    ConsoleUtils.display(
                            "Music: " + music.getTitle() + "\n" +
                                    "Singer: " + music.getSinger() + "\n" +
                                    "Duration: " + music.getDuration() + " Minutes" + "\n" +
                                    "Reproductions: " + music.getTotalReproductions() + "\n" +
                                    "Likes: " + music.getLikes() + "\n" +
                                    "Classification: " + music.getClassification() + " Stars" + "\n"
                            );
                    favorites.publicFavorites(music);
                    break;
                case 2:
                    System.out.println("Podcasts");
                    Podcast podcast = new Podcast(
                            "Serial",
                            60,
                            12
                    );
                    for (int i = 0; i < random.nextInt(2000); i++) {
                        podcast.like();
                    }
                    for (int i = 0; i < random.nextInt(1000); i++) {
                        podcast.play();
                    }
                    ConsoleUtils.display(
                            "Podcast: " + podcast.getTitle() + "\n" +
                                    "Episode: " + podcast.getEpisode() + "\n" +
                                    "Duration: " + podcast.getDuration() + " Minutes" + "\n" +
                                    "Reproductions: " + podcast.getTotalReproductions() + "\n" +
                                    "Likes: " + podcast.getLikes() + "\n" +
                                    "Classification: " + podcast.getClassification() + " Stars" + "\n"
                            );
                    favorites.publicFavorites(podcast);
                    break;
                case 3:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
