package ru.job4j.algorithm.math;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n;
        for (int i = 0; i < n; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }
}