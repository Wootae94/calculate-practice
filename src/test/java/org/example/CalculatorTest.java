package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CalculatorTest {

    @DisplayName("덧셈 연산 수행")
    @Test
    void additionTest() {
        double result = Calculator.calculate(1, "+", 2);

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺄셈 연산 수행")
    @Test
    void subtractionTest() {
        double result = Calculator.calculate(1, "-", 2);

        assertThat(result).isEqualTo(-1);
    }

    @DisplayName("곱셈 연산 수행")
    @Test
    void multiplicationTest() {
        double result = Calculator.calculate(1, "*", 2);

        assertThat(result).isEqualTo(2);
    }

    @DisplayName("나눗셈 연산 수행")
    @Test
    void divisionTest() {
        double result = Calculator.calculate(1, "/", 2);

        assertThat(result).isEqualTo(0.5);
    }

    @DisplayName("나눗셈 연산 수행 - 0으로 나누기")
    @Test
    void divisionByZeroTest() {
        assertThatCode(() -> Calculator.calculate(10,"/",0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0으로는 나눌 수 없습니다.");
    }

}
