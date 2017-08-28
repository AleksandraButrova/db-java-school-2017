package com.db.heroes_game;

import java.util.Random;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

public abstract class Character {
    String name;
    int power;
    int hp;

    public Character(){
        name = Fairy.create().person().firstName();
    }

    public void kick(Character c){
        c.beKicked((new Random()).nextInt(this.power));
    }

    public void beKicked(int power){
        this.hp -= power;
    }

    public void die(){
        this.hp = 0;
    }

    public void changePower(int power){
        this.power += power;
    }

    public String getName(){
        return this.name;
    }

    boolean isAlive(){
        return hp > 0 ? true : false;
    }

    public String getState(){
        return name + " hp = " + Integer.toString(hp) + " power = " + Integer.toString(power);
    }
}
