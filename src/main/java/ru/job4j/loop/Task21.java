package ru.job4j.loop;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        System.out.println("Старт");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 38; i > 9; i--) {
            if (i % 5 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }
}
