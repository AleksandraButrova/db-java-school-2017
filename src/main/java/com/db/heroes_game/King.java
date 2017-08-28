package com.db.heroes_game;

import java.util.Random;

public class King extends Character {
    public King(){
        Random random = new Random();
        power = random.nextInt(10) + 5;
        hp = random.nextInt(10) + 5;
        name = "King " + name;
    }

    public static King newInstance() {
        return new King();
    }
}
