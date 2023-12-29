package ru.job4j.array;

import java.util.*;

public class Task75 {
    public static void array(int[] array) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int number : array) {
            Integer value = temp.getOrDefault(number, 0);
            temp.put(number, value + 1);
        }
        StringJoiner first = new StringJoiner(", ");
        for (int i = 1; i < 10; i++) {
            StringBuilder builder = new StringBuilder();
            builder
                    .append(i)
                    .append(": ")
                    .append(temp.getOrDefault(i, 0));
            first.add(builder);
        }
        System.out.println(first);
        int max = Collections.max(temp.values());
        int min = Collections.min(temp.values());
        StringJoiner often = new StringJoiner(" ");
        StringJoiner notUse = new StringJoiner(" ");
        StringJoiner rare = new StringJoiner(" ");
        for (int i = 1; i < 10; i++) {
            Integer number = temp.getOrDefault(i, 0);
            if (number == 0) {
                notUse.add(String.valueOf(i));
            }
            if (max != min) {
                if (number == max) {
                    often.add(String.valueOf(i));
                }
                if (number == min) {
                    rare.add(String.valueOf(i));
                }
            }
        }
        if (often.length() == 0) {
            often.add("0");
        }
        if (rare.length() == 0) {
            rare.add("0");
        }
        System.out.printf("Чаще: %s, отсутствует: %s, реже: %s%n", often, notUse, rare);
    }
}
