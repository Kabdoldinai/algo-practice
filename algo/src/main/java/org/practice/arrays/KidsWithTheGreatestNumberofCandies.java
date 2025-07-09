package org.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberofCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

}
