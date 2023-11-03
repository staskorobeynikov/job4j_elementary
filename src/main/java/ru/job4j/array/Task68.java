package ru.job4j.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner buffer = new StringJoiner(" ");
        for (int element : arr) {
            buffer.add(String.valueOf(element));
        }
        System.out.println(buffer);
    }
}
