package ru.job4j.algorithm.a75.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityIITest {

    private boolean isValidResult(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((i % 2 == 0 && (nums[i] & 1) != 0) || (i % 2 == 1 && (nums[i] & 1) == 0)) {
                return false;
            }
        }
        return true;
    }

    @Test
    void testSimpleCase() {
        SortArrayByParityII sorter = new SortArrayByParityII();
        int[] input = {4, 1, 2, 3};
        int[] result = sorter.sortArrayByParityII(input);
        assertTrue(isValidResult(result));
    }

    @Test
    void testAlreadySorted() {
        SortArrayByParityII sorter = new SortArrayByParityII();
        int[] input = {2, 1, 4, 3, 6, 5};
        int[] result = sorter.sortArrayByParityII(input);
        assertTrue(isValidResult(result));
    }

    @Test
    void testMaxLength() {
        SortArrayByParityII sorter = new SortArrayByParityII();
        int[] input = new int[20000];
        for (int i = 0; i < 10000; i++) {
            input[2 * i] = 2;     // even
            input[2 * i + 1] = 1; // odd
        }
        int[] result = sorter.sortArrayByParityII(input);
        assertTrue(isValidResult(result));
    }

    @Test
    void testWithZerosAndMaxValues() {
        SortArrayByParityII sorter = new SortArrayByParityII();
        int[] input = {0, 1, 1000, 999, 2, 3, 4, 5};
        int[] result = sorter.sortArrayByParityII(input);
        assertTrue(isValidResult(result));
    }

    @Test
    void testMinimalLength() {
        SortArrayByParityII sorter = new SortArrayByParityII();
        int[] input = {2, 1};
        int[] result = sorter.sortArrayByParityII(input);
        assertTrue(isValidResult(result));
    }
}