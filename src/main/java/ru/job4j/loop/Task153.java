package ru.job4j.loop;

public class Task153 {
    private static final int COST_X = 10;
    private static final int COST_Y = 5;
    private static final int MONEY = 100;

    public static void loop() {
        int limit = MONEY / COST_X;
        for (int i = 0; i <= limit; i++) {
            int countY = (MONEY - COST_X * i) / COST_Y;
            System.out.printf("Быков: %s, коров: %s%n", i, countY);
        }
    }
}
