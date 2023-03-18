package ru.job4j.loop;

public class Task55 {
    public static void loop(int[] array) {
        int even = 0;
        int notEven = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            } else {
                notEven++;
            }
        }
        System.out.printf("Четных: %s, нечетных: %s%n", even, notEven);
    }
}
