package ru.job4j.loop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task79 {
    public static void loop(int[] grades) {
        double avg;
        int bad = 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
            if (grade <= 2) {
                bad++;
            }
        }
        avg = (double) sum / grades.length;
        BigDecimal result = new BigDecimal(avg).setScale(1, RoundingMode.HALF_UP);
        System.out.printf("Средняя оценка: %s, неуд. оценка: %d%n", result, bad);
    }
}
