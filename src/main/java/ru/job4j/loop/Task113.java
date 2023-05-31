package ru.job4j.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sumFirst = 0;
        int sumSecond = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                break;
            }
            sumFirst += first[i];
            sumSecond += second[i];
        }
        System.out.printf("Сумма1: %s, сумма2: %s%n", sumFirst, sumSecond);
    }
}
