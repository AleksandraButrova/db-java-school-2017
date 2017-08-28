package com.db.my_spring;

import javafx.scene.effect.Reflection;

import java.util.Random;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class PowerCleaner implements Cleaner {
    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("FFFFFFFFFFFFFFFFFFFFFFffffffffff");
        }
    }
}
