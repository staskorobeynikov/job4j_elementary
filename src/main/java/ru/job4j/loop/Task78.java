package ru.job4j.loop;

public class Task78 {
    public static void loop(int[] days, int[] values ) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < days.length; i++) {
            if (values[i] >= 7) {
                x++;
            }
            if (days[i] == 2 && values[i] <= 5) {
                y++;
            }
        }
        System.out.printf("Опасно: %s, спокойный вторник: %s%n", x, y);
    }
}
