package tdd_kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.tdd_kata.PalindromeRadar;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeRadarTest {

    private PalindromeRadar palindromeRadar;

    @BeforeEach
    void onSetup() {
        palindromeRadar = new PalindromeRadar();
    }

    @Test
    void shouldReturnTrueWhenGivenPalindrome() {
        assertTrue(palindromeRadar.isPalindrome("anna"));
    }

    @Test
    void shouldReturnFalseWhenGivenNonPalindrome() {
        assertFalse(palindromeRadar.isPalindrome("hello"));
    }

    @Test
    void shouldIgnoreSpaces() {
        assertTrue(palindromeRadar.isPalindrome("race car"));
    }

    @Test
    void shouldIgnorePunctuation() {
        assertTrue(palindromeRadar.isPalindrome("race, car"));
    }

    @Test
    void shouldExclamationMark() {
        assertTrue(palindromeRadar.isPalindrome("race, car!"));
    }

    @Test
    void shouldIgnoreDifferencesInLetterCase() {
        assertTrue(palindromeRadar.isPalindrome("A1b2B1a"));
    }

    @Test
    void shouldTreatNumsAsString() {
        assertTrue(palindromeRadar.isPalindrome("1race car1"));
    }

    @Test
    void shouldReturnTrueOnEmptyString() {
        assertTrue(palindromeRadar.isPalindrome(""));
    }
}
