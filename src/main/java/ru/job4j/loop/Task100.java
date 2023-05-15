package ru.job4j.loop;

public class Task100 {
    public static void loop(int[] num) {
        int result = Integer.MIN_VALUE;
        int check = -1;
        for (int number : num) {
            int i = number % 10 + number / 10;
            if (i > check) {
                result = number;
                check = i;
            }
        }
        System.out.println(result);
    }
}
