package ru.job4j.loop;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i < 500; i++) {
            int last = i % 10;
            int middle = i / 10 % 10;
            int first = i / 100;
            if (first * first + last * last == middle * middle) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
