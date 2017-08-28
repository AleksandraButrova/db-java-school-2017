package com.db.arithmetic_exercise.operations;

import com.db.arithmetic_exercise.operands.Operand;

public interface Operation <T extends Number> {
    T calculate(Operand<T> o1, Operand <T> o2);

    String toString();
}