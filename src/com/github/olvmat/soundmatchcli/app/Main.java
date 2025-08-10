package com.github.olvmat.soundmatchcli.app;

import com.github.olvmat.soundmatchcli.models.Music;
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
                                    "Likes: " + music.getLikes() + "\n"
                            );
                    music.play();
                    break;
                case 2:
                    System.out.println("Podcasts");
                    break;
                case 3:
                    System.out.println("Leaving...");
                    return;
            }
        }
    }
}
