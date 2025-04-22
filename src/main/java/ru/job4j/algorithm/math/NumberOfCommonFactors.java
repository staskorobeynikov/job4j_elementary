package ru.job4j.algorithm.math;

public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int result = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                result++;
            }
        }
        return result;
    }
}