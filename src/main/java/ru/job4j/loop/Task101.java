package ru.job4j.loop;

public class Task101 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : num) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.printf("Max: %s, min: %s%n", max, min);
    }
}
