package org.practice.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumOfDistinctSubArraysWithLengthK {

    /*
    * {1,1,1,7,8,9};
    *
    * */
    public long maximumSumSubArray(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>(); // 1 // remove 1 // 1 // remove 1 // add 1 // 7 // 8 // 9
        int maxSum = 0;
        int left = 0; // 1 // 2 // 3
        int sum = 0; // 1 // 0 // 1 // 0 // 1 // 8 // 16 // 15 // 24

        // 0, i = 1, // i = 2 // i = 3 // i = 4
        for (int i = 0; i < nums.length; i++) {

            while (numsSet.contains(nums[i])) {
                numsSet.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            numsSet.add(nums[i]);
            sum += nums[i];


            if (i - left + 1 == k) {
                numsSet.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }


        return maxSum;
    }

}
