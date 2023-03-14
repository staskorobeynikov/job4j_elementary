package ru.job4j.loop;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        while (min > 0) {
            joiner.add(String.valueOf(max));
            max++;
            min--;
        }
        System.out.println(joiner);
    }
}
