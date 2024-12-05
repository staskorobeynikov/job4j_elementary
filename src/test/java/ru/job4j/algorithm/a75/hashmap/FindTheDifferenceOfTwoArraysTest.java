package ru.job4j.algorithm.a75.hashmap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class FindTheDifferenceOfTwoArraysTest {

    @Test
    void testBasicCase() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1, 3), result.get(0), "Unique elements in nums1 should be [1, 3]");
        assertEquals(Arrays.asList(4, 6), result.get(1), "Unique elements in nums2 should be [4, 6]");
    }

    @Test
    void testNoDifference() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertTrue(result.get(0).isEmpty(), "No unique elements in nums1");
        assertTrue(result.get(1).isEmpty(), "No unique elements in nums2");
    }

    @Test
    void testEmptyNums1() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertTrue(result.get(0).isEmpty(), "No unique elements in nums1");
        assertEquals(Arrays.asList(1, 2, 3), result.get(1), "Unique elements in nums2 should be [1, 2, 3]");
    }

    @Test
    void testEmptyNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1, 2, 3), result.get(0), "Unique elements in nums1 should be [1, 2, 3]");
        assertTrue(result.get(1).isEmpty(), "No unique elements in nums2");
    }

    @Test
    void testDisjointArrays() {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1, 3, 5), result.get(0), "All elements in nums1 are unique");
        assertEquals(Arrays.asList(2, 4, 6), result.get(1), "All elements in nums2 are unique");
    }

    @Test
    void testWithDuplicatesInNums1() {
        int[] nums1 = {1, 1, 2, 3};
        int[] nums2 = {3, 4, 4, 6};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1, 2), result.get(0), "Unique elements in nums1 should be [1, 2]");
        assertEquals(Arrays.asList(4, 6), result.get(1), "Unique elements in nums2 should be [4, 6]");
    }

    @Test
    void testWithDuplicatesInNums2() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 2, 4, 4};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1, 3), result.get(0), "Unique elements in nums1 should be [1, 3]");
        assertEquals(Arrays.asList(4), result.get(1), "Unique elements in nums2 should be [4]");
    }

    @Test
    void testBothEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertTrue(result.get(0).isEmpty(), "No unique elements in nums1");
        assertTrue(result.get(1).isEmpty(), "No unique elements in nums2");
    }

    @Test
    void testSubsetCase() {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 2, 3, 4};
        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        assertTrue(result.get(0).isEmpty(), "No unique elements in nums1");
        assertEquals(Arrays.asList(3, 4), result.get(1), "Unique elements in nums2 should be [3, 4]");
    }
}
