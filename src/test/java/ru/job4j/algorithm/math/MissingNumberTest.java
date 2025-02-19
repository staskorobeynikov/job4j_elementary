package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    void testMissingNumberInMiddle() {
        MissingNumber solution = new MissingNumber();
        assertEquals(2, solution.missingNumber(new int[]{0, 1, 3}), "Expected missing number: 2");
        assertEquals(4, solution.missingNumber(new int[]{0, 1, 2, 3, 5}), "Expected missing number: 4");
    }

    @Test
    void testMissingNumberAtEnd() {
        MissingNumber solution = new MissingNumber();
        assertEquals(3, solution.missingNumber(new int[]{0, 1, 2}), "Expected missing number: 3");
        assertEquals(5, solution.missingNumber(new int[]{0, 1, 2, 3, 4}), "Expected missing number: 5");
    }

    @Test
    void testMissingNumberAtStart() {
        MissingNumber solution = new MissingNumber();
        assertEquals(0, solution.missingNumber(new int[]{1, 2, 3}), "Expected missing number: 0");
        assertEquals(0, solution.missingNumber(new int[]{2, 1}), "Expected missing number: 0");
    }

    @Test
    void testSingleElement() {
        MissingNumber solution = new MissingNumber();
        assertEquals(1, solution.missingNumber(new int[]{0}), "Expected missing number: 1");
        assertEquals(0, solution.missingNumber(new int[]{1}), "Expected missing number: 0");
    }

    @Test
    void testLargeArray() {
        MissingNumber solution = new MissingNumber();
        int n = 1000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1; // Пропускаем 0
        }
        assertEquals(0, solution.missingNumber(nums), "Expected missing number: 0");
    }
}
