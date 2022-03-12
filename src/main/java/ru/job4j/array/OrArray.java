package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        if (left.length == 0) {
            return right;
        } else if (right.length == 0) {
            return left;
        }
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        for (int j : left) {
            rsl[count++] = j;
        }
        for (int j : right) {
            int lCount = 0;
            while (lCount < left.length) {
                if (left[lCount] == j) {
                    break;
                } else {
                    lCount++;
                }
                if (lCount == left.length) {
                    rsl[count++] = j;
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
