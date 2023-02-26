package ru.job4j.loop;

import java.util.StringJoiner;

public class Task40 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 20; i < 40; i++) {
            int check = i % 10;
            if (check != 0 && check % 3 == 0 && (i / 10) % 3 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
