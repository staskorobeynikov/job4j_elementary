package ru.job4j.loop;

public class Task96 {
    public static void loop(int[] num) {
        int result = Integer.MAX_VALUE;
        for (int j : num) {
            if (result > j) {
                result = j;
            }
        }
        System.out.println(result);
    }
}
