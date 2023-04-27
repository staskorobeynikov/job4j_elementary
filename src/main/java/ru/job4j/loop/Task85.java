package ru.job4j.loop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money + money * percent / 100.0;
        for (int i = 1; i < months; i++) {
            sum += sum * percent / 100.0;
        }
        BigDecimal result = BigDecimal
                .valueOf(sum)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println(result);
    }
}
