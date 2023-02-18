package ru.job4j.loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = 0 ;
        while (counter < 5) {
            num -= 6;
            joiner.add(String.valueOf(num));
            counter++;
        }
        System.out.println(joiner);
    }
}
