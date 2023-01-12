package ru.job4j.loop;

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        System.out.println("Начало");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 20; i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Конец");
    }
}
