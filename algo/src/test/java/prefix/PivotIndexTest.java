package prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.prefix.PivotIndex;

class PivotIndexTest {

    private PivotIndex pivotIndex;

    @BeforeEach
    void onSetUp() {
        pivotIndex = new PivotIndex();
    }

    @Test
    void shouldReturnIndexOfZeroWhenGivenArrayOfNums() {
        int[] nums = new int[]{2, 1, -1};
        Assertions.assertEquals(0, pivotIndex.pivotIndex(nums));
    }

    @Test
    void shouldReturnNegativeOneWhenGivenArrayOfNums() {
        int[] nums = new int[]{1,2,3};
        Assertions.assertEquals(-1, pivotIndex.pivotIndex(nums));
    }

}
