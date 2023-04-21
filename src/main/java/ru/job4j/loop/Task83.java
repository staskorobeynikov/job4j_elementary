package ru.job4j.loop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task83 {
    public static void loop(int num) {
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += Math.sqrt(2 * i - 1);
        }
        System.out.print(BigDecimal.valueOf(sum).setScale(2, RoundingMode.HALF_UP));
    }
}
