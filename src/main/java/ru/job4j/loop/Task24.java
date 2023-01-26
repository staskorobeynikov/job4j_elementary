package ru.job4j.loop;

public class Task24 {
    public static void loop(int num) {
        int count = 0;
        num -= 10;
        StringBuilder result = new StringBuilder();
        while (count < 5) {
            result.append(num).append(" ");
            num -= 6;
            count++;
        }
        System.out.println(result.toString().trim());
    }
}
