package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ToLowerCaseTest {

    @Test
    void testAllUppercaseLetters() {
        ToLowerCase solution = new ToLowerCase();
        assertEquals("hello", solution.toLowerCase("HELLO"), "Expected 'hello' for input 'HELLO'");
        assertEquals("java", solution.toLowerCase("JAVA"), "Expected 'java' for input 'JAVA'");
        assertEquals("testcase", solution.toLowerCase("TESTCASE"), "Expected 'testcase' for input 'TESTCASE'");
    }

    @Test
    void testMixedCaseLetters() {
        ToLowerCase solution = new ToLowerCase();
        assertEquals("hello world", solution.toLowerCase("Hello World"), "Expected 'hello world' for input 'Hello World'");
        assertEquals("java programming", solution.toLowerCase("Java Programming"), "Expected 'java programming' for input 'Java Programming'");
    }

    @Test
    void testAllLowercaseLetters() {
        ToLowerCase solution = new ToLowerCase();
        assertEquals("hello", solution.toLowerCase("hello"), "Expected 'hello' for input 'hello'");
        assertEquals("java", solution.toLowerCase("java"), "Expected 'java' for input 'java'");
    }

    @Test
    void testEmptyString() {
        ToLowerCase solution = new ToLowerCase();
        assertEquals("", solution.toLowerCase(""), "Expected empty string for empty input");
    }

    @Test
    void testStringWithNumbersAndSymbols() {
        ToLowerCase solution = new ToLowerCase();
        assertEquals("1234!@#$", solution.toLowerCase("1234!@#$"), "Expected '1234!@#$' for input '1234!@#$'");
        assertEquals("hello123world!", solution.toLowerCase("Hello123World!"), "Expected 'hello123world!' for input 'Hello123World!'");
    }

    @Test
    void testStringWithSpaces() {
        ToLowerCase solution = new ToLowerCase();
        assertEquals("   hello world   ", solution.toLowerCase("   HELLO World   "), "Expected '   hello world   ' for input '   HELLO World   '");
    }
}
