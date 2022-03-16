package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        if (right.length == 0) {
            return left;
        }
        int[] rsl = new int[left.length + right.length];
        int size = 0;
        for (int k : left) {
            int count = 0;
            for (int j = 0; j < right.length; j++) {
                if (k == right[j]) {
                    right[j] = 0;
                    break;
                }
                count++;
                if (count == right.length) {
                    rsl[size++] = k;
                }

            }
        }
        for (int i : right) {
            if (i != 0) {
                rsl[size++] = i;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
