package ru.job4j.algorithm.a75.array;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
    public int differenceOfSum(int[] nums) {
        int sumNumbers = 0;
        int sumOfDigits = 0;
        for (int num : nums) {
            sumNumbers += num;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sumOfDigits += digit;
                temp /= 10;
            }
        }
        return Math.abs(sumNumbers - sumOfDigits);
    }
}
