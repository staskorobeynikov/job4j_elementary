package ru.job4j.algorithm.sliding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutDuplicatesTest {
    @Test
    void testEmptyString() {
        assertEquals(0, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1(""),
                "Empty string should return 0");
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("a"),
                "String with one character should return 1");
    }

    @Test
    void testNoRepeatingCharacters() {
        assertEquals(6, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("abcdef"),
                "String with no repeating characters should return its length");
    }

    @Test
    void testAllRepeatingCharacters() {
        assertEquals(1, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("aaaaaa"),
                "String with all repeating characters should return 1");
    }

    @Test
    void testSomeRepeatingCharacters() {
        assertEquals(3, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("abcabcbb"),
                "String with repeating characters should return length of longest substring without repeats");
    }

    @Test
    void testMixedCharacters() {
        assertEquals(5, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("abcbdef"),
                "String with mixed repeating and non-repeating characters should return correct result");
    }

    @Test
    void testLongestAtStart() {
        assertEquals(3, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("abcabc"),
                "The longest substring without duplicates is at the start");
    }

    @Test
    void testNumbersAndLetters() {
        assertEquals(7, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("abc1234abc"),
                "String with numbers and letters should return correct length");
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(8, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("a!b@c#d$"),
                "String with special characters should return correct result");
    }

    @Test
    void testUnicodeCharacters() {
        assertEquals(3, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("日本語日本"),
                "String with Unicode characters should return correct length");
    }

    @Test
    void testSpacesInString() {
        assertEquals(4, LongestSubstringWithoutDuplicates.lengthOfLongestSubstring1("a bc d e"),
                "String with spaces should return correct result");
    }
}