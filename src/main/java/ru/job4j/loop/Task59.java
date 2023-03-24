package ru.job4j.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int equal = 0;
        int less = 0;
        for (int j : array) {
            if (j < num) {
                less++;
            } else if (j == num) {
                equal++;
            }
        }
        System.out.printf("Равно: %s, меньше: %s%n", equal, less);
    }
}
