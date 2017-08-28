package com.db.my_spring;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class IRobot {
    @InjectByFieldType
    private Speaker speaker;

    @InjectByFieldType
    private Cleaner cleaner;

    @PostConstruct
    public void init(){
        System.out.println("PostConstructor works!");
    }

    public void cleanRoom() {
        speaker.speak("я начал уборку");
        cleaner.clean();
        speaker.speak("я закончил уборку");
    }

}
