package ru.job4j.algorithm.math;

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int count = 0;
        for (int current = num; current > 0; current /= 10) {
            int digit = current % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
        }
        return count;
    }
}
