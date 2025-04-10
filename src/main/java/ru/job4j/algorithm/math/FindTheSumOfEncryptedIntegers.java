package ru.job4j.algorithm.math;

public class FindTheSumOfEncryptedIntegers {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += getNumber(num);
        }
        return sum;
    }

    private int getNumber(int num) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
            count++;
        }
        int digit = 0;
        for (int i = 0; i < count; i++) {
            digit = digit * 10 + max;
        }
        return digit;
    }
}
