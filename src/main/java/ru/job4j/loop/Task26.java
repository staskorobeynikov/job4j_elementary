package ru.job4j.loop;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int i = 0;
        int number = 0;
        while (i < 2 * num) {
            joiner.add(String.valueOf(number));
            number -= 8;
            i++;
        }
        System.out.println(joiner);
    }
}
