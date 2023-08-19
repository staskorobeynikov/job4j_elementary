package ru.job4j.loop;

public class Task155 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            System.out.printf("Число: %s, сумма делителей: %s%n", i, sum);
        }
    }
}
