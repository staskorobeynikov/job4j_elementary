package ru.job4j.loop;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int previous = a1;
        int next = a2;
        int result = previous + next;
        for (int i = 2; i < num; i++) {
            int temp = previous;
            previous = next;
            next += temp;
            result = result + next;
        }
        System.out.println(result);
    }
}
