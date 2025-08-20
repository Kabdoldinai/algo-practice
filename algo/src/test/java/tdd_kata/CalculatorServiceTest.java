package tdd_kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.tdd_kata.CalculatorService;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void shouldReturnZeroWhenGivenEmptyString() {
        Assertions.assertEquals(0, calculatorService.add(""));
    }

    @Test
    void shouldReturnParsedNumWhenGivenStringNum() {
        Assertions.assertEquals(5, calculatorService.add("5"));
    }

    @Test
    void shouldReturnSumWhenGivenCommaSeparatedStringNums() {
        Assertions.assertEquals(3, calculatorService.add("1,2"));
    }

    @Test
    void shouldReturnSumWhenGivenMoreThanTwoStringNums() {
        Assertions.assertEquals(10, calculatorService.add("1,2,3,4"));
    }

}
