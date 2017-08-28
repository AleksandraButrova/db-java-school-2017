package com.db.my_spring;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        ObjectFactory factory = ObjectFactory.getInstance();
        IRobot iRobot = factory.createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}

