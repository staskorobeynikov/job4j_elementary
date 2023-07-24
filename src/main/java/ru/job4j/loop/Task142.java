package ru.job4j.loop;

public class Task142 {
    public static void loop(int num) {
        int previous = 0;
        int next = 1;
        boolean result = false;
        while (num >= next) {
            if (next == num) {
                result = true;
                break;
            }
            int sum = previous + next;
            previous = next;
            next = sum;
        }
        System.out.println(result || num == 0 ? "Да" : "Нет");
    }
}
