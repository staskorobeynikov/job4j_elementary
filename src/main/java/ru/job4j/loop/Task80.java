package ru.job4j.loop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg;
        double badAvg;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int grade : grades) {
            if (grade > 2) {
                sumGood += grade;
                good++;
            } else {
                sumBad += grade;
                bad++;
            }
        }
        goodAvg = good == 0 ? 0.0 : (double) sumGood / good;
        badAvg = bad == 0 ? 0.0 : (double) sumBad / bad;
        BigDecimal resultGood = BigDecimal.valueOf(goodAvg).setScale(1, RoundingMode.HALF_UP);
        BigDecimal resultBad = BigDecimal.valueOf(badAvg).setScale(1, RoundingMode.HALF_UP);
        System.out.printf("Средняя удовл. оценка: %s, средняя неуд. оценка: %s%n", resultGood, resultBad);
    }
}
