package com.db.heroes_game;

import javax.swing.*;

public class GameManager {
    public void fight(Character hero1, Character hero2){
        JOptionPane.showMessageDialog(null, "Let the fight begin!\n\n" + hero1.getState() + "\nvs\n" + hero2.getState());
        if (hero1 instanceof Hobbit && hero2 instanceof Hobbit){
            JOptionPane.showMessageDialog(null, "\nHobbits cried each other to death.");
            return;
        }

        if (hero1 instanceof Elf && hero2 instanceof Elf){
            JOptionPane.showMessageDialog(null, "\nIt was long long fight. \nAudience didn't survive.");
            return;
        }

        int round = 1;
        while(hero1.isAlive() && hero2.isAlive()){
            System.out.println("\nRound " + round + hero1.getName() + "is attacking.");
            hero1.kick(hero2);
            System.out.println(hero2.getState());

            if (hero2.isAlive()) {
                System.out.println(hero2.getName() + "is attacking");
                hero2.kick(hero1);
                System.out.println(hero1.getState());
            } else{
                JOptionPane.showMessageDialog(null, "Fight over\n\n" + hero2.getName() +  " died.\n" + hero1.getName()+ " won!");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Fight over\n\n" + hero1.getName() +  " died.\n" + hero2.getName()+ " won!");
    }

    public void play(CharacterFactory characterFactory){
        String[] buttons = {"Create new hero", "Play", "Show all created heroes"};

        while (true) {
            int rc = JOptionPane.showOptionDialog(null, "What do you want to do?", "Game",
                    JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);

            if (rc == -1) {
                return;
            } else if (rc == 0) {
                characterFactory.createCharacter();
            } else if (rc == 1) {
                this.fight(characterFactory.getCharacter(), characterFactory.getCharacter());
            } else if (rc == 2) {
                JOptionPane.showMessageDialog(null, characterFactory.getAllCharacter());
            }
        }
    }
}
