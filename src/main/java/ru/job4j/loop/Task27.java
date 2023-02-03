package ru.job4j.loop;

import java.util.StringJoiner;

public class Task27 {
    public static void loop(int num) {
        num -= 1;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = -num; i <= num; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
