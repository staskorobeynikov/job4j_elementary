package ru.job4j.algorithm.arrayshash;

public class FindTheMaximumDivisibilityScore {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = 0;
        int result = divisors[0];
        for (int divisor : divisors) {
            int count = 0;
            for (int num : nums) {
                if (num % divisor == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = divisor;
            } else if (max == count) {
                result = Math.min(result, divisor);
            }
        }
        return result;
    }
}