package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    @DisplayName("덧셈 연산 수행")
    @Test
    void additionTest() {
        double result = Calculator.calculate("1 + 2");

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺄셈 연산 수행")
    @Test
    void subtractionTest() {
        double result = Calculator.calculate("1 - 2");

        assertThat(result).isEqualTo(-1);
    }

    @DisplayName("곱셈 연산 수행")
    @Test
    void multiplicationTest() {
        double result = Calculator.calculate("1 * 2");

        assertThat(result).isEqualTo(2);
    }

    @DisplayName("나눗셈 연산 수행")
    @Test
    void divisionTest() {
        double result = Calculator.calculate("1 / 2");

        assertThat(result).isEqualTo(0.5);
    }


}
