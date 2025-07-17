package sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.sliding_window.FindAverage;

public class FindAverageTest {

    @Test
    public void shouldReturnAverageOfFiveElWhenInputGiven() {
        FindAverage findAverage = new FindAverage();
        int[] input = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
        double[] expectedResult = new double[]{2.2, 2.8, 2.4, 3.6, 2.8};
        Assertions.assertArrayEquals(expectedResult, findAverage.findAverages(5, input));
    }

}
