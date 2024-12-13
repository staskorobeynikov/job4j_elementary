package ru.job4j.algorithm.a75.stack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemovingStarsFromAStringTest {

    @Test
    void testBasicCase() {
        String input = "leet**cod*e";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("lecoe", result, "Expected result after removing stars is 'lecoe'");
    }

    @Test
    void testNoStars() {
        String input = "hello";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("hello", result, "String without stars should remain unchanged");
    }

    @Test
    void testOnlyStars() {
        String input = "****";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("", result, "String with only stars should result in an empty string");
    }

    @Test
    void testStarAtBeginning() {
        String input = "*abc";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("abc", result, "Stars at the beginning should have no effect");
    }

    @Test
    void testStarAtEnd() {
        String input = "abc*";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("ab", result, "Star at the end should remove the last character");
    }

    @Test
    void testMultipleStarsRemovingAll() {
        String input = "abc***";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("", result, "Multiple stars should remove all characters");
    }

    @Test
    void testInterleavedStars() {
        String input = "a*b*c*";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("", result, "Interleaved stars should result in an empty string");
    }

    @Test
    void testEmptyString() {
        String input = "";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("", result, "Empty string should result in an empty string");
    }

    @Test
    void testStarsWithNoCharacters() {
        String input = "*";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("", result, "Single star with no characters should result in an empty string");
    }

    @Test
    void testComplexCase() {
        String input = "a*bc**d*ef**";
        String result = RemovingStarsFromAString.removeStars(input);
        assertEquals("", result, "Expected result after removing stars is 'e'");
    }
}
