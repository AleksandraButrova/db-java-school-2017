package com.db.arithmetic_exercise.operands;

public abstract class Operand <T extends Number> {
    protected T value;

    public Number getValue() {
        return value;
    }
}
