package ru.job4j.loop;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = 0;
        for (int i = 100; i < 1000; i++) {
            int cubed = getCubed(i);
            if (i == cubed) {
                joiner.add(String.valueOf(i));
                counter++;
            }
        }
        System.out.printf("Числа: %s, Количество: %s%n", joiner, counter);
    }

    private static int getCubed(int number) {
        int f = number % 10;
        int s = number / 10 % 10;
        int t = number / 100;
        return f * f * f + s * s * s + t * t * t;
    }
}
