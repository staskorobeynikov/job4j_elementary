package ru.job4j.algorithm.a75.slidingwindow;

public class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int l = 0;
        double result = Integer.MIN_VALUE;
        int sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            if (r - l + 1 == k) {
                result = Math.max(result, (double) sum / k);
                sum -= nums[l];
                l++;
            }
        }
        return result;
    }
}
