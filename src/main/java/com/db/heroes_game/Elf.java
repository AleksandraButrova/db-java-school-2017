package com.db.heroes_game;

import java.util.Random;

public class Elf extends Character {
    public Elf(){
        power = 10;
        hp = 10;
        name = "Elf " + name;
    }

    @Override
    public void kick(Character c) {
        if (this.power > c.power){
            c.die();
        } else {
            c.changePower(-1);
        }
    }

    public static Elf newInstance() {
        return new Elf();
    }
}
