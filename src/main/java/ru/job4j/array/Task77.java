package ru.job4j.array;

public class Task77 {
    public static void array(int[] first, int[] second, int[] third) {
        int[] buffer = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            int sum = first[i] + second[i] + third[i];
            buffer[i] = sum;
        }
        System.out.printf("Первый: %s, второй: %s, третий: %s%n", buffer[0], buffer[1], buffer[2]);
    }
}
