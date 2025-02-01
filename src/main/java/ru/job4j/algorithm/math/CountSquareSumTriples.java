package ru.job4j.algorithm.math;

public class CountSquareSumTriples {
    public int countTriples(int n) {
        int result = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int sumOfSquares = a * a + b * b;
                int c = (int) Math.sqrt(sumOfSquares);
                if (c <= n && c * c == sumOfSquares) {
                    result++;
                }
            }
        }
        return result;
    }
}