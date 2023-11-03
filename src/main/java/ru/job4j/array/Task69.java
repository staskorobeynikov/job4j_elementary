package ru.job4j.array;

import java.util.StringJoiner;

public class Task69 {
    public static void array(int[] arr) {
        StringJoiner buffer = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            buffer.add(String.valueOf(arr[arr.length - 1 - i]));
        }
        System.out.println(buffer);
    }
}
