package ru.job4j.loop;

import java.util.StringJoiner;

public class Task164 {
    public static void loop() {
        StringJoiner buffer = new StringJoiner(" ");
        for (int i = 10; i < 100; i++) {
            if (i * i <= 300) {
                buffer.add(String.valueOf(i));
            }
        }
        System.out.println(buffer);
    }
}
