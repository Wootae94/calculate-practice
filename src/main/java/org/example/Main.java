package org.example;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("다음과 같은 방식으로 입력해주세요. \"operand operator operand\"");
            return;
        }

        String input = args[0];
        Calculator calculator = new Calculator();
        try {
            double result = calculator.calculate(input);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
