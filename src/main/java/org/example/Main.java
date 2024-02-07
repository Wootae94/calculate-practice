package org.example;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("다음과 같은 방식으로 입력해주세요. \"operand operator operand\"");
            return;
        }

        String input = args[0];
        String[] tokens = input.split("\\s+");

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];
        try {
            double result = Calculator.calculate(operand1, operator, operand2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
