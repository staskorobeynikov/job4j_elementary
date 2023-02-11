package ru.job4j.loop;

import java.util.StringJoiner;

public class Task28 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            if (sum(i) == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static int sum(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
