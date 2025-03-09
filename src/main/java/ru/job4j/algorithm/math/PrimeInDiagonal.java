package ru.job4j.algorithm.math;

public class PrimeInDiagonal {
    public int diagonalPrime(int[][] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i])) {
                result = Math.max(result, nums[i][i]);
            }
            if (isPrime(nums[i][nums.length - 1 - i])) {
                result = Math.max(result, nums[i][nums.length - 1 - i]);
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
