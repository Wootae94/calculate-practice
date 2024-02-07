package org.example.operatorFactory;

public class DivisionOperator implements ArithmetricOperator{
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public double calculate(double operand1, double operand2) {
        if(operand2 == 0){
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
        }
        return operand1 / operand2;
    }
}
