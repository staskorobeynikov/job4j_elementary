package ru.job4j.loop;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int i = 0;
        int number = 7;
        while (i < num) {
            joiner.add(String.valueOf(number));
            number += 4;
            i++;
        }
        System.out.println(joiner);
    }
}
