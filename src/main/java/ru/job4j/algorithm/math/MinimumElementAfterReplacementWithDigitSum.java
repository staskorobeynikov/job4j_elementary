package ru.job4j.algorithm.math;

public class MinimumElementAfterReplacementWithDigitSum {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, getSum(num));
        }
        return min;
    }

    private int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
