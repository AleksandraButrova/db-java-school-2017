package com.db.heroes_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CharacterFactory {
    int amount;
    List<Character> heroes;
    Class[] classes = new Class[]{Elf.class, Hobbit.class, King.class, Knight.class};

    public CharacterFactory() {
        heroes = new ArrayList<>();
        amount = 0;
    }

    public void createCharacter() {
        Random random = new Random();
        int choice = random.nextInt(classes.length);

        Character hero;

        Class aClass = classes[choice];
        try {
            hero = (Character) aClass.newInstance();
            heroes.add(hero);
            amount++;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Character getCharacter() {
        return heroes.get(new Random().nextInt(amount));
    }

    public String getAllCharacter() {
        String res = "";

        for (Character hero : heroes) {
            res += hero.getState() + "\n";
        }

        return res;
    }
}
