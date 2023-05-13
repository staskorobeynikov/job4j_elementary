package ru.job4j.loop;

public class Task98 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : num) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println((min + max) / 2);
    }
}
