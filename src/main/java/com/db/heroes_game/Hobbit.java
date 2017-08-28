package com.db.heroes_game;

public class Hobbit extends Character {
    public Hobbit(){
        power = 0;
        hp = 3;
        name = "Hobbit " + name;
    }

    @Override
    public void kick(Character c) {
        System.out.println("T_T");
    }

    public static Hobbit newInstance() {
        return new Hobbit();
    }
}
