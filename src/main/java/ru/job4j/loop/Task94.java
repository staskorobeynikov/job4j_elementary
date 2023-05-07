package ru.job4j.loop;

import java.util.StringJoiner;

public class Task94 {
    public static void loop(int[] diameter, int[] weight) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < diameter.length; i++) {
            if (Math.abs(24 - diameter[i]) <= 2 && Math.abs(74 - weight[i]) <= 3) {
                joiner.add("Да");
            } else {
                joiner.add("Нет");
            }
        }
        System.out.println(joiner);
    }
}
