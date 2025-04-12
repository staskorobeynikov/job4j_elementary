package ru.job4j.algorithm.math;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                result += Math.min(num % 3, 3 - num % 3);
            }
        }
        return result;
    }
}
