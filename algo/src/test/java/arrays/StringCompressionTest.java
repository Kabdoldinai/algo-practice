package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.StringCompression;

public class StringCompressionTest {

    @Test
    public void shouldReturnSixWhenInputContainsCoupledValues() {
        StringCompression stringCompression = new StringCompression();
        char[] input = new char[]{'a','a','b','b','c','c','c'};
        Assertions.assertEquals(6, stringCompression.compress(input));
    }

    @Test
    public void shouldReturnOneWhenInputContainsOneValue() {
        StringCompression stringCompression = new StringCompression();
        char[] input = new char[]{'a'};
        Assertions.assertEquals(1, stringCompression.compress(input));
    }


}
