package ru.job4j.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(0));
            } else {
                joiner.add(String.valueOf(i * i));
            }
        }
        System.out.println(joiner);
    }
}
