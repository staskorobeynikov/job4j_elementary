package ru.job4j.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        boolean contains = false;
        while (num > 0) {
            if (num % 10 == digit) {
                contains = true;
                break;
            }
            num /= 10;
        }
        System.out.println(contains ? "Да" : "Нет");
    }
}
