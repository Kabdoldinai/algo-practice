package org.practice.arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int right = 1;

        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }

}
