package ru.job4j.algorithm.sliding;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FindTheKBeautyOfANumberTest {
    @Test
    void testBasicCase() {
        int num = 240;
        int k = 2;
        int result = FindTheKBeautyOfANumber.divisorSubstrings(num, k);
        assertEquals(2, result, "The k-beauty of 240 with k = 2 "
                                + "should be 2 (substrings '24' and '40')");
    }

    @Test
    void testSingleDigitNum() {
        int num = 5;
        int k = 1;
        int result = FindTheKBeautyOfANumber.divisorSubstrings(num, k);
        assertEquals(1, result, "The k-beauty of 5 with k = 1 "
                                + "should be 1 ('5' is a divisor of itself)");
    }

    @Test
    void testNumWithLeadingZeros() {
        int num = 105;
        int k = 2;
        int result = FindTheKBeautyOfANumber.divisorSubstrings(num, k);
        assertEquals(1, result, "The k-beauty of 105 with k = 2 "
                                + "should be 1 (only '05' is ignored, and '10' is a divisor)");
    }

    @Test
    void testNumWithAllSubstringsDivisible() {
        int num = 111;
        int k = 1;
        int result = FindTheKBeautyOfANumber.divisorSubstrings(num, k);
        assertEquals(3, result, "The k-beauty of 111 with k = 1 "
                                + "should be 3 (all digits '1' are divisors)");
    }

    @Test
    void testZeroDivisorAvoidance() {
        int num = 1005;
        int k = 2;
        int result = FindTheKBeautyOfANumber.divisorSubstrings(num, k);
        assertEquals(1, result, "The k-beauty of 1005 with k = 2 "
                                + "should be 1 (substring '10' is a divisor, '00' and '05' are not)");
    }

    @Test
    void testNumWithKEqualToLength() {
        int num = 202;
        int k = 3;
        int result = FindTheKBeautyOfANumber.divisorSubstrings(num, k);
        assertEquals(1, result, "The k-beauty of 202 with k = 3 "
                                + "should be 1 (substring '202' is a divisor of itself)");
    }
}