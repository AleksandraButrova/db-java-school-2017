package com.db.my_spring;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
