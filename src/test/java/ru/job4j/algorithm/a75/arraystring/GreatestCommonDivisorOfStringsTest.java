package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorOfStringsTest {

    @Test
    void testCommonDivisorExists() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals("ABC", result, "The GCD of 'ABCABC' and 'ABC' should be 'ABC'");
    }

    @Test
    void testEqualStrings() {
        String str1 = "ABC";
        String str2 = "ABC";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals("ABC", result, "The GCD of 'ABC' and 'ABC' should be 'ABC'");
    }

    @Test
    void testOneStringIsMultipleOfOther() {
        String str1 = "ABABAB";
        String str2 = "AB";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals("AB", result, "The GCD of 'ABABAB' and 'AB' should be 'AB'");
    }

    @Test
    void testNoCommonDivisorComplexCase() {
        String str1 = "ABABAB";
        String str2 = "ABA";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals("", result, "The GCD of 'ABABAB' and 'ABA' should be an empty string as there is no common divisor");
    }

    @Test
    void testLargeCommonDivisor() {
        String str1 = "XYXYXYXY";
        String str2 = "XYXY";
        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);
        assertEquals("XYXY", result, "The GCD of 'XYXYXYXY' and 'XYXY' should be 'XYXY'");
    }
}