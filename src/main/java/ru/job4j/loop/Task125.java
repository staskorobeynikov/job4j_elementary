package ru.job4j.loop;

import java.util.StringJoiner;

public class Task125 {
    public static void loop(int num) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner notEven = new StringJoiner(" ");
        String value = String.valueOf(num);
        for (int i = 0; i < value.length(); i++) {
            int number = Integer.parseInt(value.charAt(i) + "");
            if (number % 2 == 0) {
                even.add(String.valueOf(number));
            } else {
                notEven.add(String.valueOf(number));
            }
        }
        if (even.length() != 0 && notEven.length() != 0) {
            System.out.println(even);
            System.out.println(notEven);
        } else if (even.length() != 0) {
            System.out.println(even);
        } else {
            System.out.println(notEven);
        }
    }
}
