package com.db.arithmetic_exercise.generators;

import com.db.arithmetic_exercise.*;
import com.db.arithmetic_exercise.operands.Exercise;
import com.db.arithmetic_exercise.operands.NumericOperand;
import com.db.arithmetic_exercise.operations.Operations;

import java.util.Random;

public class RandomExerciseGenerator implements ExerciseGenerator{

    public Exercise getExercise() {
        Exercise exercise = new Exercise();
        Random random = new Random();

        exercise.setArgument1(new NumericOperand(random.nextInt(9) + 1));
        exercise.setArgument2(new NumericOperand(random.nextInt(9) + 1));
        exercise.setOperation(Operations.getOperation(random.nextInt(Operations.values().length)));

        System.out.printf(exercise.toString() + " = " + exercise.getValue() + "\n");

        return exercise;
    }
}