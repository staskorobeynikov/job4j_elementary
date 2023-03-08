package ru.job4j.loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1350; i < 1450; i++) {
            if ((i % 10 + i / 10 % 10) == (i / 100 % 10 + i / 1000)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
