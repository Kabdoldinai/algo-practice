package org.practice.arrays;

public class ReverseWordsInaString {

    public String reverseWords(String s) {
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while ( i>= 0) {
            while ( i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break;
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i + 1, j + 1)).append(" ");
        }

        return sb.toString().trim();
    }

/*
    Time complexity: O(n)
    Space complexity: O(n)
 */

}
