package ru.job4j.loop;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int first = i / 10;
            int last = i % 10;
            if (2 * (first + last) == last * first) {
                joiner.add(String.valueOf(i));
                sum += i;
                counter++;
            }
        }
        System.out.printf("Числа: %s, Количество: %s, Сумма: %s%n", joiner, counter, sum);
    }
}
