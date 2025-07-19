package sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.sliding_window.MaximumSumOfDistinctSubArraysWithLengthK;

public class MaximumSumOfDistinctSubArraysWithLengthKTest {


    @Test
    public void shouldReturnMaxValueWhenCalculationSubOfSubArray() {
        MaximumSumOfDistinctSubArraysWithLengthK maxSub = new MaximumSumOfDistinctSubArraysWithLengthK();
        int[] input = new int[]{1,5,4,2,9,9,9};
        Assertions.assertEquals(15, maxSub.maximumSumSubArray(input, 3));
    }


    @Test
    public void shouldReturnZeroWhenAllElementsRepeated() {
        MaximumSumOfDistinctSubArraysWithLengthK maxSub = new MaximumSumOfDistinctSubArraysWithLengthK();
        int[] input = new int[]{4,4,4};
        Assertions.assertEquals(0, maxSub.maximumSumSubArray(input, 3));
    }

    @Test
    public void shouldReturnMaxValueWhenGivingRepeatedAndDistinctElements() {
        MaximumSumOfDistinctSubArraysWithLengthK maxSub = new MaximumSumOfDistinctSubArraysWithLengthK();
        int[] input = new int[]{1,1,1,7,8,9};
        Assertions.assertEquals(24, maxSub.maximumSumSubArray(input, 3));
    }
}
