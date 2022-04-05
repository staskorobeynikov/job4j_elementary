package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        for (int i = 2; i < n; i++) {
            int element = 0;
            for (int j = 0; j < i; j++) {
                element += rsl[j];
            }
            rsl[i] = element;
        }
        return rsl;
    }
}
