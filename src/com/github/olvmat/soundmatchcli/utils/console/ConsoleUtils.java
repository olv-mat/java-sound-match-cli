package com.github.olvmat.soundmatchcli.utils.console;

import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public ConsoleUtils() {
    }

    public static void display(String content) {
        System.out.println("=".repeat(30));
        System.out.print(content);
    }

    public static int readInt() {
        return scanner.nextInt();
    }
}
