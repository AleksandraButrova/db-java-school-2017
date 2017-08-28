package com.db.arithmetic_exercise.operands;

import com.db.arithmetic_exercise.operations.Operation;

public class Exercise extends Operand {
    Operand argument1;
    Operand argument2;
    Operation operation;

    public Exercise(){};
    Exercise(Operand argument1, Operand argument2, Operation operation) {
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return argument1.toString() + operation.toString() + argument2.toString();
    }

    public void setArgument1(Operand argument1) {
        this.argument1 = argument1;
    }

    public void setArgument2(Operand argument2) {
        this.argument2 = argument2;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;

        value = operation.calculate(argument1, argument2);
    }

}