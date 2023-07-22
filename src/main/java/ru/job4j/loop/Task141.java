package ru.job4j.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int count = 0;
        StringJoiner joiner = new StringJoiner(" ");
        while (max > min) {
            if (max % 2 == 0) {
                max /= 2;
            } else {
                max -= 1;
            }
            if (max == min) {
                break;
            }
            count++;
            joiner.add(String.valueOf(max));
        }
        System.out.printf("Числа: %s, Количество: %s%n", joiner.length() == 0 ? 0 : joiner, count);
    }
}
