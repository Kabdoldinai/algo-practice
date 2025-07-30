package sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.practice.sliding_window.LongestSubstringWithoutRepeatingCharacters;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void shouldReturnThreeWhenGivingThreeLongestSustr() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        Assertions.assertEquals(3, longest.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void shouldReturnZeroWhenGivingEmptyString() {
        LongestSubstringWithoutRepeatingCharacters longest = new LongestSubstringWithoutRepeatingCharacters();
        Assertions.assertEquals(0, longest.lengthOfLongestSubstring(""));
    }

}
