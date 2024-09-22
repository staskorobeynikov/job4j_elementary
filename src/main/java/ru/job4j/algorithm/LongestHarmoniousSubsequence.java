package ru.job4j.algorithm;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] - nums[l] > 1) {
                l++;
            }
            if (nums[r] - nums[l] == 1) {
                result = Math.max(result, r - l + 1);
            }
        }
        return result;
    }
}
