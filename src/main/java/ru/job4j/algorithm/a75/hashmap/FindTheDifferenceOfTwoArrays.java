package ru.job4j.algorithm.a75.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = getSet(nums1);
        Set<Integer> set2 = getSet(nums2);
        return Arrays.asList(
                getUnique(set1, set2),
                getUnique(set2, set1)
        );
    }

    private static Set<Integer> getSet(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            result.add(num);
        }
        return result;
    }

    private static List<Integer> getUnique(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> result = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
