package ru.job4j.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = 0;
        int start = 1;
        while (counter < 5) {
            joiner.add(String.valueOf(start));
            start += n;
            counter++;
        }
        System.out.println(joiner);
    }
}
