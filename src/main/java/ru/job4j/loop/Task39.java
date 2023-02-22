package ru.job4j.loop;

import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 200; i <= 210; i++) {
            if (i % getMultiplier(i) == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static int getMultiplier(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
