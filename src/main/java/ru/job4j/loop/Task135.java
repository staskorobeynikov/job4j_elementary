package ru.job4j.loop;

public class Task135 {
    public static void loop(int num) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int check = num % 10;
            result.append(check == 0 ? "" : check);
            num /= 10;
        }
        System.out.println(result);
    }
}
