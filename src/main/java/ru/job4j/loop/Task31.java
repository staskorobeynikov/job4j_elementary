package ru.job4j.loop;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (multiply(i) < num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static int multiply(int number) {
        int result = 1;
        while (number > 0) {
            result *= number % 10;
            number /= 10;
        }
        return result;
    }
}
