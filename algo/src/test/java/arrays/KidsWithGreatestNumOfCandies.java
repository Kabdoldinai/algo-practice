package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.KidsWithTheGreatestNumberofCandies;

import java.util.List;

class KidsWithGreatestNumOfCandies {

    @Test
    void testCandiesCorrectness() {
        KidsWithTheGreatestNumberofCandies kidsWithTheGreatestNumberofCandies = new KidsWithTheGreatestNumberofCandies();
        List<Boolean> expectedResult = List.of(true,false,false,false,false);
        int[] candies = new int[]{4,2,1,1,2};
        Assertions.assertEquals(expectedResult, kidsWithTheGreatestNumberofCandies.kidsWithCandies(candies, 1));
    }

    @Test
    void testCandiesCorrectnessWithAlternativeVals() {
        KidsWithTheGreatestNumberofCandies kidsWithTheGreatestNumberofCandies = new KidsWithTheGreatestNumberofCandies();
        List<Boolean> expectedResult = List.of(true,false,true);
        int[] candies = new int[]{12,1,12};
        Assertions.assertEquals(expectedResult, kidsWithTheGreatestNumberofCandies.kidsWithCandies(candies, 10));
    }

}
