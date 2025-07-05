package org.practice.hashmap_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDifferenceofTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> currentNum1 = new HashSet<>();
        Set<Integer> currentNum2 = new HashSet<>();


        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();

        int left = 0, right = 0;

        while(left < nums1.length) {
            num1Set.add(nums1[left]);
            left++;
        }

        while (right < nums2.length) {
            num2Set.add(nums2[right]);
            right++;
        }


        for (int num1 : nums1) {
            if(!num2Set.contains(num1)) {
                currentNum1.add(num1);
            }
        }
        result.add(new ArrayList<>(currentNum1));

        for (int num2 : nums2) {
            if(!num1Set.contains(num2)) {
                currentNum2.add(num2);
            }
        }
        result.add(new ArrayList<>(currentNum2));


        return result;
    }


}
