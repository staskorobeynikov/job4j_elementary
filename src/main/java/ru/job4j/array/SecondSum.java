package ru.job4j.array;

public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i += 2) {
            rsl += i;
        }
        return rsl;
    }
}
