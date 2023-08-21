package ru.job4j.loop;

public class Task156 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            StringBuilder result = new StringBuilder(String.valueOf(i));
            for (int j = 1; j <= num; j++) {
                if (i % j == 0) {
                    result.append("+");
                }
            }
            System.out.println(result);
        }
    }
}
