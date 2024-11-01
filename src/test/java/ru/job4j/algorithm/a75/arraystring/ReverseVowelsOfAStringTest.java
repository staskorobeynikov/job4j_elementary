package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseVowelsOfAStringTest {

    @Test
    void testMixedCaseVowels() {
        String input = "hello";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("holle", result, "Reversing vowels in 'hello' should result in 'holle'");
    }

    @Test
    void testUpperCaseVowels() {
        String input = "HELLO";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("HOLLE", result, "Reversing vowels in 'HELLO' should result in 'HOLLE'");
    }

    @Test
    void testNoVowels() {
        String input = "bcdfg";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("bcdfg", result, "A string without vowels should remain the same");
    }

    @Test
    void testAllVowels() {
        String input = "aeiou";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("uoiea", result, "Reversing vowels in 'aeiou' should result in 'uoiea'");
    }

    @Test
    void testSingleVowel() {
        String input = "a";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("a", result, "A single vowel should remain the same");
    }

    @Test
    void testSingleConsonant() {
        String input = "b";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("b", result, "A single consonant should remain the same");
    }

    @Test
    void testEmptyString() {
        String input = "";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("", result, "An empty string should remain empty");
    }

    @Test
    void testStringWithSpacesAndVowels() {
        String input = "a man a plan a canal panama";
        String result = ReverseVowelsOfAString.reverseVowels(input);
        assertEquals("a man a plan a canal panama", result, "Reversing vowels in palindrome should result in the same string");
    }
}
