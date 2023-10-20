package ru.job4j.array;

import java.util.StringJoiner;

public class Task73 {
    public static void array(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            StringJoiner buffer = new StringJoiner(" ");
            buffer.add(String.valueOf(arr[i]));
            buffer.add(String.valueOf(arr[arr.length - 1 - i]));
            System.out.println(buffer);
        }
        if (arr.length % 2 != 0) {
            System.out.println(arr[arr.length / 2]);
        }
    }
}
