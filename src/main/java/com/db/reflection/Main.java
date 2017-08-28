package com.db.reflection;

import com.db.heroes_game.Elf;

public class Main {
    public static void main(String[] args) {
        ReflectionUtil.printAllMethods(new Elf());
    }

}
