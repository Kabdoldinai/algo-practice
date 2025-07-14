package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.arrays.CanPlaceFlowers;

public class CanPlaceFlowersTest {

    @Test
    public void canPlaceFlowersWithZeroesAtTheStart() {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        int[] flowerbed = new int[]{0,0,0,0,0,1,0,0};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void canPlaceFlowersWithZeroesWithNEqualsToZero() {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        int[] flowerbed = new int[]{1,0,0,0,0,1};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 0));
    }

}
