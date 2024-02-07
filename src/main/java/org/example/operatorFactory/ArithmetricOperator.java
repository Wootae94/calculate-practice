package org.example.operatorFactory;

public interface ArithmetricOperator {

    boolean supports(String operator);
    double calculate(double operand1,double operand2);
}
