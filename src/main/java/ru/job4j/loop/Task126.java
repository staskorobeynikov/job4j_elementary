package ru.job4j.loop;

import java.util.StringJoiner;

public class Task126 {
    public static void loop(int num) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner notEven = new StringJoiner(" ");
        String value = String.valueOf(num);
        for (int i = 0; i < value.length(); i++) {
            String element = String.valueOf(value.charAt(i));
            if ((i + 1) % 2 == 0) {
                even.add(element);
            } else {
                notEven.add(element);
            }
        }
        System.out.println(even);
        System.out.println(notEven);
    }
}
