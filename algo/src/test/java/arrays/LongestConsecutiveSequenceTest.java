package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceTest {

    @Test
    public void shouldReturnLengthOfConsecutiveSequence_whenGivenUnorderedArray() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] inputNus = new int[]{100,4,200,1,3,2};
        Assertions.assertEquals(4, longestConsecutiveSequence.longestConsecutive(inputNus));
    }

    @Test
    public void shouldReturnLongestConsecutiveLength_whenArrayHasShuffledConsecutiveNumbers() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] inputNus = new int[]{0,3,7,2,5,8,4,6,0,1};
        Assertions.assertEquals(9, longestConsecutiveSequence.longestConsecutive(inputNus));
    }

}
