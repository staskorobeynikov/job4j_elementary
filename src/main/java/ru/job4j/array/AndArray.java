package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = 0;
        int[] rsl = new int[left.length + right.length];
        for (int first : left) {
            for (int second : right) {
                if (first == second) {
                    rsl[count++] = first;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, count);
    }
}
