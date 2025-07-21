package org.practice.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int left = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            while (charSet.contains(s.charAt(i))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

}
