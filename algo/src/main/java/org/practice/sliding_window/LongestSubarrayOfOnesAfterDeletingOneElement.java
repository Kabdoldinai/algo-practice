package org.practice.sliding_window;

public class LongestSubarrayOfOnesAfterDeletingOneElement {

    public int longestSubarray(int[] nums) {
        int left = 0, zeroes = 0, max = 0;

        for (int i  = 0; i < nums.length; i++) {

            if (nums[i] == 0) zeroes++;

            if (zeroes > 1) {
                if (nums[left] == 0) zeroes--;
                left++;
            }

            max = Math.max(max, i - left);
        }

        return max;
    }


}
