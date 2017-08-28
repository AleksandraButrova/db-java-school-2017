package com.db.heroes_game;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        GameManager game = new GameManager();

        game.play(characterFactory);
    }
}
