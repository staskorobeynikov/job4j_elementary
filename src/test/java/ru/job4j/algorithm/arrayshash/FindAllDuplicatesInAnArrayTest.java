package ru.job4j.algorithm.arrayshash;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class FindAllDuplicatesInAnArrayTest {

    @Test
    void testSingleDuplicate() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {1, 2, 3, 2};
        assertEquals(List.of(2), solver.findDuplicates(nums), "Expected [2] as duplicate.");
    }

    @Test
    void testMultipleDuplicates() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        assertEquals(List.of(2, 3), solver.findDuplicates(nums), "Expected [2, 3] as duplicates.");
    }

    @Test
    void testNoDuplicates() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(List.of(), solver.findDuplicates(nums), "Expected empty list with no duplicates.");
    }

    @Test
    void testAllDuplicates() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {2, 2, 3, 3, 4, 4};
        assertEquals(List.of(2, 3, 4), solver.findDuplicates(nums), "Expected all values as duplicates.");
    }

    @Test
    void testAllSame() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {4, 4, 3, 3};
        assertEquals(List.of(3, 4), solver.findDuplicates(nums), "Expected [3, 4] as only duplicate.");
    }

    @Test
    void testEmptyArray() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {};
        assertEquals(List.of(), solver.findDuplicates(nums), "Expected empty result for empty input.");
    }

    @Test
    void testSingleElement() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = {1};
        assertEquals(List.of(), solver.findDuplicates(nums), "Expected empty result for single-element input.");
    }

    @Test
    void testLargeArrayWithOneDuplicate() {
        FindAllDuplicatesInAnArray solver = new FindAllDuplicatesInAnArray();
        int[] nums = new int[100];
        for (int i = 0; i < 99; i++) {
            nums[i] = i + 1;
        }
        nums[99] = 42;
        assertEquals(List.of(42), solver.findDuplicates(nums), "Expected [42] as duplicate.");
    }
}