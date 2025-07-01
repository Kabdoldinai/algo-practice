package org.practice.binary_search;

import java.util.Arrays;

public class SuccessfulPairs {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int count = binarySearch(spells[i], potions, success);
            result[i] = count;
        }

        return result;
    }

    private int binarySearch(int spell, int[] potions, long success) {
        int left = 0, right = potions.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = spell * potions[mid];

            if (sum >= success) right = mid - 1;
            else left = mid + 1;
        }

        return potions.length - left;
    }

}
