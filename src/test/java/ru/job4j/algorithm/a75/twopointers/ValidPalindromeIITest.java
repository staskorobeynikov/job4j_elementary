package ru.job4j.algorithm.a75.twopointers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidPalindromeIITest {

    @Test
    void testValidPalindromeWithoutDeletion() {
        ValidPalindromeII solution = new ValidPalindromeII();
        assertTrue(solution.validPalindrome("racecar"), "racecar is already a palindrome");
        assertTrue(solution.validPalindrome("madam"), "madam is already a palindrome");
        assertTrue(solution.validPalindrome("abba"), "abba is already a palindrome");
    }

    @Test
    void testValidPalindromeWithSingleDeletion() {
        ValidPalindromeII solution = new ValidPalindromeII();
        assertTrue(solution.validPalindrome("abca"), "Removing 'b' or 'c' makes it a palindrome (aca or aba)");
        assertTrue(solution.validPalindrome("deeee"), "Removing 'd' makes it a palindrome (eeee)");
        assertTrue(solution.validPalindrome("raceeecar"), "Removing an extra 'e' makes it a palindrome");
    }

    @Test
    void testInvalidPalindromeEvenAfterOneDeletion() {
        ValidPalindromeII solution = new ValidPalindromeII();
        assertFalse(solution.validPalindrome("abcdef"), "abcdef cannot be a palindrome even after one deletion");
        assertFalse(solution.validPalindrome("hello"), "hello cannot be a palindrome even after one deletion");
        assertFalse(solution.validPalindrome("palindrome"), "palindrome cannot be a palindrome after one deletion");
    }

    @Test
    void testSingleCharacterString() {
        ValidPalindromeII solution = new ValidPalindromeII();
        assertTrue(solution.validPalindrome("a"), "A single character is always a palindrome");
    }

    @Test
    void testTwoCharacterString() {
        ValidPalindromeII solution = new ValidPalindromeII();
        assertTrue(solution.validPalindrome("aa"), "aa is already a palindrome");
        assertTrue(solution.validPalindrome("ab"), "ab can become a palindrome by removing 'a' or 'b'");
    }

    @Test
    void testEdgeCases() {
        ValidPalindromeII solution = new ValidPalindromeII();
        assertTrue(solution.validPalindrome(""), "An empty string is a palindrome");
        assertTrue(solution.validPalindrome("a"), "A single character is always a palindrome");
        assertTrue(solution.validPalindrome("ccbcc"), "Removing one 'b' makes it a palindrome");
    }
}
