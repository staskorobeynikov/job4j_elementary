package ru.job4j.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        for (int i = num + 1; i < Integer.MAX_VALUE; i++) {
            sum += i;
            if (sum >= num * num) {
                break;
            }
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
