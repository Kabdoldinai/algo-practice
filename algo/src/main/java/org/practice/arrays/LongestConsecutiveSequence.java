package org.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            numsSet.add(num);
        }

        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int sum = num + 1;
                int counter = 1;
                while (numsSet.contains(sum)) {
                    counter++;
                    sum++;
                }

                count = Math.max(count, counter);
            }
        }

        return count;
    }

}
