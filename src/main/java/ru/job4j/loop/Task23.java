package ru.job4j.loop;

public class Task23 {
    public static void loop(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = num; i < num + 5; i++) {
            result.append(i + 1).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
