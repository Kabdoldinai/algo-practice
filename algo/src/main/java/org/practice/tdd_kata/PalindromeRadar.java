package org.practice.tdd_kata;

public class PalindromeRadar {

    public boolean isPalindrome(String radarSignal) {

        int left = 0;
        int right = radarSignal.length() - 1;

        while (left < right) {

            while (!Character.isLetterOrDigit(radarSignal.charAt(left))) left++;
            while (!Character.isLetterOrDigit(radarSignal.charAt(right))) right--;

            if (Character.toLowerCase(radarSignal.charAt(left)) != Character.toLowerCase(radarSignal.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
