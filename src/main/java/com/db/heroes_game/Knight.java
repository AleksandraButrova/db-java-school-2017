package com.db.heroes_game;

import java.util.Random;

public class Knight extends Character {
    public Knight(){
        Random random = new Random();
        power = random.nextInt(10) + 2;
        hp = random.nextInt(10) + 2;
        name = "Knight " + name;
    }

    public static Knight newInstance() {
        return new Knight();
    }
}
