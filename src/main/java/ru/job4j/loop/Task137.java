package ru.job4j.loop;

public class Task137 {
    public static void loop(int num) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int check = i % 10 + i / 10;
            if (check == num) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
