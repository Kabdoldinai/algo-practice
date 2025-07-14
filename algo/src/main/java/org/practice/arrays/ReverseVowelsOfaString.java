package org.practice.arrays;

import java.util.Set;

public class ReverseVowelsOfaString {

    public String reverseVowels(String s) {
        Set<Character> charsSet = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int left = 0, right = s.length() - 1;
        char[] sArr = s.toCharArray();

        while (left < right) {
            while (left < right && !charsSet.contains(sArr[left])) left++;
            while (left < right && !charsSet.contains(sArr[right])) right--;

            char temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;

            left++;
            right--;
        }

        return new String(sArr);
    }


}
