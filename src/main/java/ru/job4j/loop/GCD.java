package ru.job4j.loop;

public class GCD {
    public static int find(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD is undefined for both arguments being zero.");
        }
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        do {
            int temp = a % b;
            a = b;
            b = temp;
        } while (b != 0);
        return Math.abs(a);
    }

    public static int find2(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD is undefined for both arguments being zero.");
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}
