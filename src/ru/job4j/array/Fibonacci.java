package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 0; i < data.length - 2; i++) {
            int prev = data[i];
            int next = data[i + 1];
            int sum = data[i + 2];
            if (sum != prev + next) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
