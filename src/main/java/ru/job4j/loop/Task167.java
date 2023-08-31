package ru.job4j.loop;

import java.util.StringJoiner;

public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        double[] array = {
                printInfoAndGetAverage(first),
                printInfoAndGetAverage(second),
                printInfoAndGetAverage(third)
        };
        double max = 0;
        int count = 0;
        for (double value : array) {
            if (value > max) {
                max = value;
            }
            if (value > 4.5) {
                count++;
            }
        }
        System.out.printf("Выше 4.5: %s, наивысшая: %s%n", count, max);
    }

    private static double printInfoAndGetAverage(int[] array) {
        int sum = 0;
        StringJoiner buffer = new StringJoiner(" ");
        for (int number : array) {
            buffer.add(String.valueOf(number));
            sum += number;
        }
        double avg = (double) sum / array.length;
        System.out.printf("Оценки: %s, средняя: %s%n", buffer, avg);
        return avg;
    }
}
