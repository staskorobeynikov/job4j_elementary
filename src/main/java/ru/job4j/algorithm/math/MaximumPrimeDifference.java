package ru.job4j.algorithm.math;

public class MaximumPrimeDifference {
    public int maximumPrimeDifference(int[] nums) {
        int first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                first = i;
                break;
            }
        }
        int last = nums.length - 1;
        for (int i = last; i >= 0; i--) {
            if (isPrime(nums[i])) {
                last = i;
                break;
            }
        }
        return last - first;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
