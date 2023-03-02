package ru.job4j.loop;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 300; i < 325; i++) {
            int check = i % 100;
            if (check > 10 && check % (i / 100) == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}
