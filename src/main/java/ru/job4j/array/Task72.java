package ru.job4j.array;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] arr) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner notEven = new StringJoiner(" ");
        for (int el : arr) {
            if (el % 2 == 0) {
                even.add(String.valueOf(el));
            } else {
                notEven.add(String.valueOf(el));
            }
        }
        if (even.length() > 0) {
            System.out.println(even);
        }
        if (notEven.length() > 0) {
            System.out.println(notEven);
        }
    }
}
