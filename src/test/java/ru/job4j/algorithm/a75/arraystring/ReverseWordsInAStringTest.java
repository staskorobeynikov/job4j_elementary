package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringTest {

    @Test
    void testSingleWord() {
        String input = "hello";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("hello", result, "A single word should remain the same when reversed");
    }

    @Test
    void testMultipleWords() {
        String input = "the sky is blue";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("blue is sky the", result, "Words should be reversed in 'the sky is blue' to 'blue is sky the'");
    }

    @Test
    void testLeadingAndTrailingSpaces() {
        String input = "   hello world   ";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("world hello", result, "Leading and trailing spaces should be removed, result should be 'world hello'");
    }

    @Test
    void testMultipleSpacesBetweenWords() {
        String input = "a   good   example";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("example good a", result, "Multiple spaces between words should be ignored, result should be 'example good a'");
    }

    @Test
    void testAllSpaces() {
        String input = "     ";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("", result, "An input string with only spaces should return an empty string");
    }

    @Test
    void testEmptyString() {
        String input = "";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("", result, "An empty input string should return an empty string");
    }

    @Test
    void testSingleCharacter() {
        String input = "a";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("a", result, "A single character input should return the same character");
    }

    @Test
    void testStringWithMultipleSpaces() {
        String input = "   hello   world  ";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("world hello", result, "Input '   hello   world  ' should return 'world hello' with spaces trimmed");
    }

    @Test
    void testStringWithNumbersAndWords() {
        String input = "123 456 789";
        String result = ReverseWordsInAString.reverseWords(input);
        assertEquals("789 456 123", result, "Words containing numbers should be reversed in order");
    }
}
