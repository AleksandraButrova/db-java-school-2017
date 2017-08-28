package com.db.arithmetic_exercise.operations;

import java.util.Random;

public enum Operations {
    ADDITION(0, new AdditionOperation()),
    SUBTRACTION(1, new SubtractionOperation()),
    MULTIPLICATION(2, new MultiplicationOperation()),
    DIVISION(3, new AdditionOperation.DivisionOperation());

    int n;
    private Operation operation;

    Operations(int n, Operation operation) {
        this.n = n;
        this.operation = operation;
    }

    public Operation getRandomOperation(){
        int randomN = (new Random()).nextInt(values().length);

        for (Operations operation : values()) {
            if (operation.n == randomN)
                return operation.operation;

        }
        throw new RuntimeException("Some mistake in matching numbers and operation.\nCheck " + Operation.class + ".");
    }

    public static Operation getOperation(int n) {
        for (Operations operation : values()) {
            if (operation.n == n)
                return operation.operation;

        }
        throw new RuntimeException("Some mistake in matching numbers and operation.\nCheck " + Operation.class + ".");
    }
}
