package ru.job4j.loop;

import java.util.Locale;

public class Task149 {
    public static void loop(int[] grades) {
        double avg;
        int count = 0;
        int sum = 0;
        for (int grade : grades) {
            if (grade > 5 || grade < 1) {
                break;
            }
            sum += grade;
            count++;
        }
        avg = (double) sum / count;
        System.out.printf(Locale.ENGLISH, "%.2f%n", avg);
    }
}
