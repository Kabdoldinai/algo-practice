package sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.sliding_window.LongestSubarrayOfOnesAfterDeletingOneElement;

public class LongestSubarrayOfOnesAfterDeletingOneElementTest {

    @Test
    public void longestSubarray() {
        LongestSubarrayOfOnesAfterDeletingOneElement longestSubarray = new LongestSubarrayOfOnesAfterDeletingOneElement();
        int[] input = new int[]{0,1,1,1,0,1,1,0,1};
        Assertions.assertEquals(5, longestSubarray.longestSubarray(input));
    }


}
