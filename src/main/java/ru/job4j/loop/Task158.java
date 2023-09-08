package ru.job4j.loop;

public class Task158 {
    public static void loop(int num) {
        boolean result = false;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            for (int j = i; j <= Math.sqrt(num); j++) {
                if (i * i + j * j == num) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        System.out.println(result ? "Да" : "Нет");
    }
}
