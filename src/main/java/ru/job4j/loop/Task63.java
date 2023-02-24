package ru.job4j.loop;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (int answer : answers) {
            if (answer == 1) {
                count++;
            }
        }
        if (count > answers.length / 2) {
            System.out.println(count + ", Да");
        } else {
            System.out.println(count + ", Нет");
        }
    }
}
