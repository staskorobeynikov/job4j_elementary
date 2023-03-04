package ru.job4j.loop;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 1000; i++) {
            int number = getInverseNumber(i);
            if ((i % 10 + i / 10 % 10) != 0
                    && i != number
                    && Math.sqrt(i * number) % 1 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static int getInverseNumber(int number) {
        return number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
    }
}
