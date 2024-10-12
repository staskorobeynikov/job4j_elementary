package ru.job4j.algorithm.sliding;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LongestRepeatingSubstringWithReplacementTest {

    @Test
    void testCharacterReplacementBasic() {
        String input = "ABAB";
        int k = 2;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(4, result, "The longest repeating substring with 2 replacements should be 4");
    }

    @Test
    void testCharacterReplacementMixedCharacters() {
        String input = "AABABBA";
        int k = 1;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(4, result, "The longest repeating substring with 1 replacement should be 4");
    }

    @Test
    void testCharacterReplacementNoReplacementsNeeded() {
        String input = "AAAA";
        int k = 2;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(4, result, "The longest repeating substring is already 4");
    }

    @Test
    void testCharacterReplacementAllDifferent() {
        String input = "ABCDE";
        int k = 1;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(2, result, "The longest repeating substring with 1 replacement should be 2");
    }

    @Test
    void testCharacterReplacementEdgeCaseEmptyString() {
        String input = "";
        int k = 0;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(0, result, "Empty string should return 0");
    }

    @Test
    void testCharacterReplacementSingleCharacterString() {
        String input = "A";
        int k = 0;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(1, result, "Single character string should return 1");
    }

    @Test
    void testCharacterReplacementLargeK() {
        String input = "AABBBCC";
        int k = 10;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(7, result, "With large k, the longest repeating substring should be the length of the string");
    }

    @Test
    void testCharacterReplacementSingleReplacement() {
        String input = "ABAB";
        int k = 1;
        int result = LongestRepeatingSubstringWithReplacement.characterReplacement(input, k);
        assertEquals(3, result, "The longest repeating substring with 1 replacement should be 3");
    }
}
