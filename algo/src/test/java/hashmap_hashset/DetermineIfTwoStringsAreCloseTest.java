package hashmap_hashset;

import org.junit.jupiter.api.Test;
import org.practice.hashmap_hashset.DetermineIfTwoStringsAreClose;
import static org.junit.jupiter.api.Assertions.*;

class DetermineIfTwoStringsAreCloseTest {

    @Test
    void testEqualCharactersDifferenceOrder() {
        DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();
        assertTrue(determineIfTwoStringsAreClose.closeStrings("abc", "bca"));
    }

    @Test
    void testDifferentCharacters() {
        DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();
        assertFalse(determineIfTwoStringsAreClose.closeStrings("a", "aa"));
    }

    @Test
    void testEqualCharactersWithCabbbaAndAbbccc() {
        DetermineIfTwoStringsAreClose determineIfTwoStringsAreClose = new DetermineIfTwoStringsAreClose();
        assertTrue(determineIfTwoStringsAreClose.closeStrings("cabbba", "abbccc"));
    }

}
