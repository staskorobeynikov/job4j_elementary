package ru.job4j.loop;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int all = 0;
        int free = 0;
        for (int ticket : promo) {
            if (ticket / 10 > 0) {
                free += ticket / 10;
            }
            all += ticket;
        }
        for (int ticket : concert) {
            all += ticket;
        }
        System.out.printf("Продано билетов: %s, выдано бесплатно: %s%n", all, free);
    }
}
