package ru.job4j.algorithm.a75.twopointers;

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        long leftNumber = 0;
        long rightNumber = (long) Math.sqrt(c);
        while (leftNumber <= rightNumber) {
            long sum = leftNumber * leftNumber + rightNumber * rightNumber;
            if (sum == c) {
                return true;
            }
            if (sum < c) {
                leftNumber++;
            } else {
                rightNumber--;
            }
        }
        return false;
    }
}