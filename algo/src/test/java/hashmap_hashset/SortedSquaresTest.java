package hashmap_hashset;

import org.junit.jupiter.api.Test;
import org.practice.two_pointers.SortedSquares;
import static org.junit.jupiter.api.Assertions.*;

class SortedSquaresTest {

    @Test
    void testSortedSquaresCorrectness() {
        SortedSquares sortedSquares = new SortedSquares();
        int[] nums = new int[]{-4, -1, 0, 3, 10};
        int[] expectedResult = new int[]{0, 1, 9, 16, 100};
        assertArrayEquals(expectedResult, sortedSquares.sortedSquares(nums));
    }

    @Test
    void testSortedSquaresCorrectnessWithNexVal() {
        SortedSquares sortedSquares = new SortedSquares();
        int[] nums = new int[]{-3, 2, 4};
        int[] expectedResult = new int[]{4, 9, 16};
        assertArrayEquals(expectedResult, sortedSquares.sortedSquares(nums));
    }

}
