package ru.job4j.loop;

import java.util.StringJoiner;

public class Task120 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        while (num > 0) {
            num /= 10;
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }
}
