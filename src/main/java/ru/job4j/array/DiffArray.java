package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        }
        int[] rsl = new int[left.length];
        int size = 0;
        for (int k : left) {
            int count = 0;
            for (int j : right) {
                if (k == j) {
                    break;
                }
                count++;
                if (count == right.length) {
                    rsl[size++] = k;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
