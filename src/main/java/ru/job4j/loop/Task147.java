package ru.job4j.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int count = 0;
        int rejected = 0;
        int check = 0;
        for (int ticket : tickets) {
            if (check == num) {
                break;
            }
            if (check + ticket <= num) {
                check += ticket;
                count++;
            } else {
                rejected++;
            }
        }
        System.out.printf("Покупатели: %s, отказано: %s%n", count, rejected);
    }
}
