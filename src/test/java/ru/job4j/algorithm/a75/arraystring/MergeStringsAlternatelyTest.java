package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MergeStringsAlternatelyTest {

    @Test
    void testEqualLengthStrings() {
        String word1 = "abc";
        String word2 = "def";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("adbecf", result, "Merging 'abc' and 'def' alternately should result in 'adbcef'");
    }

    @Test
    void testWord1LongerThanWord2() {
        String word1 = "abcd";
        String word2 = "xy";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("axbycd", result, "Merging 'abcd' and 'xy' alternately should result in 'axbycd'");
    }

    @Test
    void testWord2LongerThanWord1() {
        String word1 = "xy";
        String word2 = "abcd";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("xaybcd", result, "Merging 'xy' and 'abcd' alternately should result in 'xaybcd'");
    }

    @Test
    void testEmptyWord1() {
        String word1 = "";
        String word2 = "abcd";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("abcd", result, "Merging an empty string and 'abcd' should result in 'abcd'");
    }

    @Test
    void testEmptyWord2() {
        String word1 = "abcd";
        String word2 = "";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("abcd", result, "Merging 'abcd' and an empty string should result in 'abcd'");
    }

    @Test
    void testBothWordsEmpty() {
        String word1 = "";
        String word2 = "";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("", result, "Merging two empty strings should result in an empty string");
    }

    @Test
    void testSingleCharacterEachWord() {
        String word1 = "a";
        String word2 = "b";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("ab", result, "Merging 'a' and 'b' should result in 'ab'");
    }

    @Test
    void testSingleCharacterAndLongWord() {
        String word1 = "a";
        String word2 = "xyz";
        String result = MergeStringsAlternately.mergeAlternately(word1, word2);
        assertEquals("axyz", result, "Merging 'a' and 'xyz' should result in 'axyz'");
    }
}
