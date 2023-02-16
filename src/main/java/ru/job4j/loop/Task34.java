package ru.job4j.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        num += 1;
        int counter = 0;
        while (counter < 5) {
            if (num % 2 != 0) {
                joiner.add(String.valueOf(num));
                counter++;
            }
            num++;
        }
        System.out.println(joiner);
    }
}
