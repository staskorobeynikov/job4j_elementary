package ru.job4j.loop;

public class Task54 {
    public static void loop(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
