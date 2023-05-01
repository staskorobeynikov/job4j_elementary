package ru.job4j.loop;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i == 3 * getMultiple(i)) {
                joiner.add(String.valueOf(i));
                counter++;
            }
        }
        System.out.printf("Числа: %s, Количество: %s%n", joiner, counter);
    }

    private static int getMultiple(int number) {
        return number / 10 * number % 10;
    }
}
