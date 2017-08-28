package com.db.arithmetic_exercise.operands;

public class NumericOperand <T extends Number> extends Operand {
    T value;

    @Override
    public String toString() {
        return value.toString();
    }

    public NumericOperand(T value) {
        this.value = value;
    }

    public Number getValue() {
        return this.value;
    }
}