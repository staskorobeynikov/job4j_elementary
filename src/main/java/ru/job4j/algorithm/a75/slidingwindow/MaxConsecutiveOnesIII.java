package ru.job4j.algorithm.a75.slidingwindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int result = 0;
        int ones = 0;
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                ones++;
            }
            while (l < r && ones > k) {
                if (nums[l] == 0) {
                    ones--;
                }
                l++;
            }
            if (ones <= k) {
                result = Math.max(result, r - l + 1);
            }
            r++;
        }
        return result;
    }
}
