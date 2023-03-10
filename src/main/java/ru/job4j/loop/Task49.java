package ru.job4j.loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        StringJoiner joiner = new StringJoiner("+");
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        if (joiner.toString().isEmpty()) {
            System.out.print("");
        } else {
            System.out.println(joiner);
        }
    }
}
