package ru.job4j.loop;

import java.util.StringJoiner;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int d = n2 - n1;
        if (n2 + d == n3) {
            StringJoiner joiner = new StringJoiner(" ");
            for (int i = 0; i < 3; i++) {
                n3 += d;
                joiner.add(String.valueOf(n3));
            }
            System.out.println(joiner);
        } else {
            System.out.println("Нет");
        }
    }
}
