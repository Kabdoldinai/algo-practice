package org.practice.two_pointers;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int position = nums.length - 1;

        while (left <= right) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if (leftVal > rightVal) {
                result[position--] = leftVal;
                left++;
            } else {
                result[position--] = rightVal;
                right--;
            }
        }
        return result;
    }

}
