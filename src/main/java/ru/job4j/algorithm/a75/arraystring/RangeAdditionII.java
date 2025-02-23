package ru.job4j.algorithm.a75.arraystring;

public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] operation : ops) {
            m = Math.min(m, operation[0]);
            n = Math.min(n, operation[1]);
        }
        return m * n;
    }
}
