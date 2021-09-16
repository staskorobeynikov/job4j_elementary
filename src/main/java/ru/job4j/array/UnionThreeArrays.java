package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[middle.length / 2 + right.length / 2 + 2];
        int length = Math.min(middle.length, right.length);
        int j = 0;
        rsl[j] = left[0];
        for (int i = 0; i < length; i++) {
            j++;
            if (i % 2 != 0) {
                rsl[j] = middle[i];
            } else {
                rsl[j] = right[i];
            }
        }
        rsl[rsl.length - 1] = left[left.length - 1];
        return rsl;
    }
}
