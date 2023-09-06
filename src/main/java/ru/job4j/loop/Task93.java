package ru.job4j.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            int check = first[i] + second[i];
            if (check >= 80) {
                sum += check;
                count++;
            }
        }
        System.out.printf("В финале: %s, сумма баллов: %s%n", count, sum);
    }
}
