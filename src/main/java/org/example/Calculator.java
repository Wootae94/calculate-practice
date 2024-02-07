package org.example;

public class Calculator {

    public static double calculate(String input) {
        String[] tokens = input.split("\\s+");

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        char operator = tokens[1].charAt(0);

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("사용할 수 없는 사칙연산입니다.: " + operator);
        }
    }
}
