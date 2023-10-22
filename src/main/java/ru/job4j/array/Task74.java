package ru.job4j.array;

import java.util.StringJoiner;

public class Task74 {
    public static void array(int[] arr) {
        StringJoiner head = new StringJoiner(" ");
        StringJoiner last = new StringJoiner(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            head.add(String.valueOf(arr[i]));
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            last.add(String.valueOf(arr[i]));
        }
        System.out.println(head);
        System.out.println(last);
    }
}
