package ru.job4j.loop;

public class Task97 {
    public static void loop(int[] num) {
        int time = Integer.MAX_VALUE;
        int number = 0;
        for (int i = 0; i < num.length; i++) {
            if (time > num[i]) {
                time = num[i];
                number = i;
            }
        }
        System.out.printf("Время: %s, номер: %s%n", time, number);
    }
}
