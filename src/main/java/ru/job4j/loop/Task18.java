package ru.job4j.loop;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        System.out.println("Начало");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 19; i++) {
            if (i % 2 == 0) {
                String element = i % 4 == 0 ? i + "#" : String.valueOf(i);
                joiner.add(element);
            }
        }
        System.out.println(joiner);
        System.out.println("Конец");
    }
}
