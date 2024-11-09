package ru.job4j.algorithm.a75.array;

public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            result = Math.min(result, sum);
        }
        return Math.max(1 - result, 1);
    }
}