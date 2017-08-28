package com.db.arithmetic_exercise;

import com.db.arithmetic_exercise.generators.RandomExerciseGenerator;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RandomExerciseGenerator exe = new RandomExerciseGenerator();

        while (true){
            exe.getExercise();
            sleep(1000);
        }
    }
}