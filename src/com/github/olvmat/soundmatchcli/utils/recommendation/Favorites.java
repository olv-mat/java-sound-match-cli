package com.github.olvmat.soundmatchcli.utils.recommendation;

import com.github.olvmat.soundmatchcli.interfaces.Classifiable;

public class Favorites {
    public void publicFavorites(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("Public Favorite!");
        }
    }
}
