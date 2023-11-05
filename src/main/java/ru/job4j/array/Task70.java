package ru.job4j.array;

import java.util.StringJoiner;

public class Task70 {

    public static void array(int[] arr) {
        StringJoiner first = new StringJoiner(" ");
        StringJoiner last = new StringJoiner(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            first.add(String.valueOf(arr[i]));
        }
        if (arr.length % 2 == 0) {
            last.add(String.valueOf(arr[arr.length / 2]));
        } else {
            first.add(String.valueOf(arr[arr.length / 2]));
        }
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            last.add(String.valueOf(arr[i]));
        }
        System.out.println(first);
        System.out.println(last);
    }
}
