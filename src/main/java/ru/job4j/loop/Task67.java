package ru.job4j.loop;

public class Task67 {
    public static void loop(int num) {
        boolean check = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Да" : "Нет");
    }
}
