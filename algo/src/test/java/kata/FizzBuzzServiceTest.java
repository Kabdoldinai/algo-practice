package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.kata.FizzBuzzService;

class FizzBuzzServiceTest {

    private FizzBuzzService fizzBuzzService;

    @BeforeEach
    void onSetUp() {
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    void shouldReturnNumAsStringWhenGivenNotMultipleOfThreeOrFive() {
        Assertions.assertEquals("1", fizzBuzzService.fizzBuzz(1));
    }

    @Test
    void shouldReturnFizzWhenGivenNumIsMultipleOfThree() {
        Assertions.assertEquals("Fizz", fizzBuzzService.fizzBuzz(6));
    }

    @Test
    void shouldReturnBuzzWhenGivenNumIsMultipleOfFive() {
        Assertions.assertEquals("Buzz", fizzBuzzService.fizzBuzz(5));
    }

    @Test
    void shouldReturnFizzBuzzWhenGivenNumBothMultipleOfThreeAndFive() {
        Assertions.assertEquals("FizzBuzz", fizzBuzzService.fizzBuzz(15));
    }

}
