package org.example;

import org.example.operatorFactory.*;

import java.util.List;

public class Calculator {

    private static final List<ArithmetricOperator> arithmeticOpertors = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static double calculate(double operand1, String operator, double operand2) {
        return arithmeticOpertors.stream()
                .filter(arithmetricOperator -> arithmetricOperator.supports(operator))
                .map(arithmetricOperator -> arithmetricOperator.calculate(operand1,operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }

}
