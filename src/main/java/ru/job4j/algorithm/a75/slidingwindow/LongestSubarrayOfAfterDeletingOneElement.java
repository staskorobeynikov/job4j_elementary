package ru.job4j.algorithm.a75.slidingwindow;

public class LongestSubarrayOfAfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int result = 0;
        int zeros = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            result = Math.max(r - l, result);
        }
        return result;
    }
}
