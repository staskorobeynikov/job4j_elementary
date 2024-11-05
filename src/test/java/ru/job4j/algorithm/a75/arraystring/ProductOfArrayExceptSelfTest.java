package ru.job4j.algorithm.a75.arraystring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    void testBasicCase() {
        int[] input = {1, 2, 3, 4};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, result, "The product array for {1, 2, 3, 4} should be {24, 12, 8, 6}");
    }

    @Test
    void testArrayWithZero() {
        int[] input = {1, 2, 0, 4};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals(expected, result, "The product array for {1, 2, 0, 4} should be {0, 0, 8, 0}");
    }

    @Test
    void testArrayWithMultipleZeros() {
        int[] input = {0, 1, 2, 0};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, result, "The product array for {0, 1, 2, 0} should be {0, 0, 0, 0}");
    }

    @Test
    void testTwoElementArray() {
        int[] input = {3, 4};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {4, 3};
        assertArrayEquals(expected, result, "The product array for {3, 4} should be {4, 3}");
    }

    @Test
    void testArrayWithNegativeNumbers() {
        int[] input = {-1, 2, -3, 4};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {-24, 12, -8, 6};
        assertArrayEquals(expected, result, "The product array for {-1, 2, -3, 4} should be {-24, 12, -8, 6}");
    }

    @Test
    void testArrayWithAllOnes() {
        int[] input = {1, 1, 1, 1};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals(expected, result, "The product array for {1, 1, 1, 1} should be {1, 1, 1, 1}");
    }

    @Test
    void testArrayWithOneZero() {
        int[] input = {1, 0, 3, 4};
        int[] result = ProductOfArrayExceptSelf.productExceptSelf(input);
        int[] expected = {0, 12, 0, 0};
        assertArrayEquals(expected, result, "The product array for {1, 0, 3, 4} should be {0, 12, 0, 0}");
    }
}
