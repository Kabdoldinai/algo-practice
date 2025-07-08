package two_pointers;

import org.junit.jupiter.api.Test;
import org.practice.two_pointers.MergeStringsAlternately;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyTest {

    @Test
    void testMergeAlternalCorrectness() {
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        String expectedResult = "apbqcr";
        assertEquals(expectedResult, mergeStringsAlternately.mergeAlternately("abc", "pqr"));
    }

    @Test
    void testMergeAlterCorrectnessWithAnotherValue() {
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        String expectedResult = "apbqrs";
        assertEquals(expectedResult, mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }

}
