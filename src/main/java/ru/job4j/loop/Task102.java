package ru.job4j.loop;

public class Task102 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : num) {
            if (number < 0 && number < min) {
                min = number;
            }
            if (number > 0 && number > max) {
                max = number;
            }
        }
        System.out.printf(
                "Max: %s, min: %s%n",
                max == Integer.MIN_VALUE ? "Нет" : max,
                min == Integer.MAX_VALUE ? "Нет" : min
        );
    }
}
