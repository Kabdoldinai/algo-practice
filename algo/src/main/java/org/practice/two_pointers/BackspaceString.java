package org.practice.two_pointers;

public class BackspaceString {

    public boolean backspaceCompare(String s, String t) {
        int left = s.length() - 1, right = t.length() - 1;
        int skipS = 0;
        int skipR = 0;

        while (left >= 0) {
            if (s.charAt(left) == '#') {
                skipS++;
                left--;
            } else if (skipS > 0) {
                skipS--;
                left--;
            } else break;


            while (right >= 0) {
                if (t.charAt(right) == '#') {
                    skipR++;
                    right--;
                } else if (skipR > 0) {
                    skipR--;
                    right--;
                } else break;
            }

            if (left >= 0 || right >= 0) {
                if (s.charAt(left) != t.charAt(right)) return false;
            }

            left--;
            right--;
        }


        return true;
    }


}
