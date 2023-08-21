package ru.job4j.loop;

import java.util.StringJoiner;

public class Task157 {
    public static void loop() {
        StringJoiner buffer = new StringJoiner(" ");
        buffer.add(String.valueOf(1));
        for (int i = 2; i < 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                buffer.add(String.valueOf(i));
            }
        }
        System.out.println(buffer);
    }
}
