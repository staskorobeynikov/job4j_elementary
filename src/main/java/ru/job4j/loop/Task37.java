package ru.job4j.loop;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 130; i++) {
            int first = i / 100;
            int middle = i / 10 % 10;
            int last = i % 10;
            if (first * last == middle * middle) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
