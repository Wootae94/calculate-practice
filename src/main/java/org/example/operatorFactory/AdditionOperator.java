package org.example.operatorFactory;

public class AdditionOperator implements ArithmetricOperator{
    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public double calculate(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
