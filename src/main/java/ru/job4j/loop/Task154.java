package ru.job4j.loop;

import java.util.StringJoiner;

public class Task154 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            StringJoiner buffer = new StringJoiner(" ");
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    buffer.add(String.valueOf(j));
                }
            }
            System.out.printf("Число: %s, делители: %s%n", i, buffer);
        }
    }
}
