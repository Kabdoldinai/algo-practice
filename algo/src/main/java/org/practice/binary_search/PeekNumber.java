package org.practice.binary_search;

/**
 *
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 *
 * https://leetcode.com/problems/find-peak-element/description/?envType=study-plan-v2&envId=leetcode-75
**/
public class PeekNumber {

    public int findPeekNumber(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else right = mid;
        }

        return left;
    }

}
