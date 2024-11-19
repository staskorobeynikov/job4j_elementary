package ru.job4j.algorithm.a75.twopointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int result = 0;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                result++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
