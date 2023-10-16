package ru.job4j.array;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner notEven = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(String.valueOf(arr[i]));
            } else {
                notEven.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(even);
        System.out.println(notEven);
    }
}
