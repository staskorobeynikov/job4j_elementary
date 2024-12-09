package ru.job4j.algorithm.a75.hashmap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DetermineIfTwoStringsAreCloseTest {

    @Test
    void testCloseStringsTrue() {
        String word1 = "abc";
        String word2 = "bca";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertTrue(result, "The words 'abc' and 'bca' are close");
    }

    @Test
    void testCloseStringsFalseDifferentLetters() {
        String word1 = "abc";
        String word2 = "def";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertFalse(result, "The words 'abc' and 'def' are not close");
    }

    @Test
    void testCloseStringsFalseDifferentFrequencies() {
        String word1 = "aabbcc";
        String word2 = "abc";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertFalse(result, "The words 'aabbcc' and 'abc' are not close due to different frequencies");
    }

    @Test
    void testCloseStringsTrueWithReordering() {
        String word1 = "aabbcc";
        String word2 = "ccbbaa";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertTrue(result, "The words 'aabbcc' and 'ccbbaa' are close");
    }

    @Test
    void testCloseStringsEmptyStrings() {
        String word1 = "";
        String word2 = "";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertTrue(result, "Two empty strings are considered close");
    }

    @Test
    void testCloseStringsOneEmptyString() {
        String word1 = "abc";
        String word2 = "";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertFalse(result, "A non-empty string and an empty string are not close");
    }

    @Test
    void testCloseStringsFalseExtraCharacters() {
        String word1 = "aabb";
        String word2 = "aabbcc";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertFalse(result, "The words 'aabb' and 'aabbcc' are not close due to extra characters");
    }

    @Test
    void testCloseStringsTrueWithSameCharactersDifferentOrder() {
        String word1 = "abcabc";
        String word2 = "bcaacb";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertTrue(result, "The words 'abcabc' and 'bcaacb' are close");
    }

    @Test
    void testCloseStringsFalseDifferentDistributions() {
        String word1 = "aaabb";
        String word2 = "aabbb";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertTrue(result, "The words 'aaabb' and 'aabbb' are not close due to different distributions of characters");
    }

    @Test
    void testCloseStringsSingleCharacter() {
        String word1 = "a";
        String word2 = "a";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertTrue(result, "The single-character strings 'a' and 'a' are close");
    }

    @Test
    void testCloseStringsFalseSingleCharacterMismatch() {
        String word1 = "a";
        String word2 = "b";
        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);
        assertFalse(result, "The single-character strings 'a' and 'b' are not close");
    }
}
