package ru.job4j.algorithm.a75.stack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DecodeStringTest {

    @Test
    void testSimpleCase() {
        String input = "3[a]";
        String result = DecodeString.decodeString(input);
        assertEquals("aaa", result, "Expected 'aaa' for input '3[a]'");
    }

    @Test
    void testNestedCase() {
        String input = "3[a2[b]]";
        String result = DecodeString.decodeString(input);
        assertEquals("abbabbabb", result, "Expected 'abbabbabb' for input '3[a2[b]]'");
    }

    @Test
    void testMultipleSections() {
        String input = "2[abc]3[cd]ef";
        String result = DecodeString.decodeString(input);
        assertEquals("abcabccdcdcdef", result, "Expected 'abcabccdcdcdef' for input '2[abc]3[cd]ef'");
    }

    @Test
    void testEmptyBrackets() {
        String input = "3[]";
        String result = DecodeString.decodeString(input);
        assertEquals("", result, "Expected empty string for input '3[]'");
    }

    @Test
    void testSingleCharacter() {
        String input = "4[x]";
        String result = DecodeString.decodeString(input);
        assertEquals("xxxx", result, "Expected 'xxxx' for input '4[x]'");
    }

    @Test
    void testMultipleNestedLevels() {
        String input = "2[a3[b4[F]c]]";
        String result = DecodeString.decodeString(input);
        assertEquals("abFFFFcbFFFFcbFFFFcabFFFFcbFFFFcbFFFFc", result, "Expected correct nesting result for input '2[a3[b4[F]c]]'");
    }

    @Test
    void testNoEncoding() {
        String input = "abcd";
        String result = DecodeString.decodeString(input);
        assertEquals("abcd", result, "Expected 'abcd' for input without encoding");
    }

    @Test
    void testLeadingNumbers() {
        String input = "10[a]";
        String result = DecodeString.decodeString(input);
        assertEquals("aaaaaaaaaa", result, "Expected 'aaaaaaaaaa' for input '10[a]'");
    }

    @Test
    void testComplexCase() {
        String input = "2[ab3[cd]4[ef]]";
        String result = DecodeString.decodeString(input);
        assertEquals("abcdcdcdefefefefabcdcdcdefefefef", result, "Expected correct decoding for complex input");
    }

    @Test
    void testEmptyString() {
        String input = "";
        String result = DecodeString.decodeString(input);
        assertEquals("", result, "Expected empty string for input ''");
    }
}