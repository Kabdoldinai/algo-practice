package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.ReverseVowelsOfaString;

public class ReverseVowelsOfaStringTest {

    @Test
    public void testReverseVowelsWithVowels() {
        ReverseVowelsOfaString reverseVowelsOfaString = new ReverseVowelsOfaString();
        Assertions.assertEquals("AceCreIm", reverseVowelsOfaString.reverseVowels("IceCreAm"));
    }

    @Test
    public void testReverseVowelsWithLeetcodeWord() {
        ReverseVowelsOfaString reverseVowelsOfaString = new ReverseVowelsOfaString();
        Assertions.assertEquals("leetcode", reverseVowelsOfaString.reverseVowels("leotcede"));
    }
}
