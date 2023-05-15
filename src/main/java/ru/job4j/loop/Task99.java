package ru.job4j.loop;

public class Task99 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : num) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
            sum += j;
        }
        System.out.println((min + max) / 2 > sum / num.length ? "Больше" : "Нет");
    }
}
