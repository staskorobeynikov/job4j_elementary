package ru.job4j.loop;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int check;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            check = (int) Math.pow(num, i);
            if (check >= 1000) {
                break;
            }
            joiner.add(String.valueOf(check));
        }
        if (joiner.length() == 0) {
            System.out.print(joiner);
        } else {
            System.out.println(joiner);
        }
    }
}
