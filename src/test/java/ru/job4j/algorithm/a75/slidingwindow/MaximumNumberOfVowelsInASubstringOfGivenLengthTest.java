package ru.job4j.algorithm.a75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    @Test
    void testBasicCase() {
        String s = "abciiidef";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(3, result, "The substring 'iii' has 3 vowels");
    }

    @Test
    void testAllVowels() {
        String s = "aeiouaeiou";
        int k = 5;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(5, result, "The substring 'aeiou' has 5 vowels");
    }

    @Test
    void testNoVowels() {
        String s = "bcdfghjklmnpqrstvwxyz";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(0, result, "No vowels in the string, so the result should be 0");
    }

    @Test
    void testMixedCase() {
        String s = "AbCdEfGhIj";
        int k = 2;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s.toLowerCase(), k);
        assertEquals(1, result, "Only 1 vowel in each substring of length 2");
    }

    @Test
    void testSingleCharacterSubstring() {
        String s = "hello";
        int k = 1;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(1, result, "Maximum vowels in substring of length 1 is 1");
    }

    @Test
    void testEntireStringAsSubstring() {
        String s = "beautiful";
        int k = s.length();
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(5, result, "The entire string has 5 vowels");
    }

    @Test
    void testStringWithRepeatingVowels() {
        String s = "aaaaaa";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(3, result, "Maximum vowels in any substring of length 3 is 3");
    }

    @Test
    void testShortString() {
        String s = "abc";
        int k = 5;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(1, result, "Only 1 vowel in the entire string");
    }

    @Test
    void testEmptyString() {
        String s = "";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);
        assertEquals(0, result, "Empty string has no vowels");
    }
}
