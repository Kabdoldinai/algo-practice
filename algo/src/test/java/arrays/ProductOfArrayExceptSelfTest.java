package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void testProductExceptSelfCorrectness() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] inputArr = new int[]{1,2,3,4};
        int[] expected = new int[]{24,12,8,6};
        Assertions.assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(inputArr));
    }

}
