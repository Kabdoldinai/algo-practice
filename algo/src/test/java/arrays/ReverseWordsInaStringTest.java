package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.ReverseWordsInaString;

public class ReverseWordsInaStringTest {

    @Test
    public void testReversingWordsWithEmptyString() {
        ReverseWordsInaString reverseWordsInaString = new ReverseWordsInaString();
        Assertions.assertEquals("", reverseWordsInaString.reverseWords(""));
    }

    @Test
    public void testReversingWordsWithGivenString() {
        ReverseWordsInaString reverseWordsInaString = new ReverseWordsInaString();
        Assertions.assertEquals("blue is sky the", reverseWordsInaString.reverseWords("the sky is blue"));
    }

}
