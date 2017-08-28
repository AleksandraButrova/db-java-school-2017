package com.db.arithmetic_exercise.operations;

import com.db.arithmetic_exercise.operands.Operand;

public class SubtractionOperation implements Operation {
    public Number calculate(Operand o1, Operand o2) {
        return o1.getValue().intValue() - o2.getValue().intValue();
    }

    @Override
    public String toString() {
        return " - ";
    }
}
