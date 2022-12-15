package ru.job4j.condition;

public class Task45 {
    public static void changeToRoundNum(int number) {
        int divider = number / 10;
        if (number % 2 == 0) {
            if (number % 10 != 0) {
                divider = (divider + 1);
            }
            System.out.println("Увеличено до " + divider * 10);
        } else {
            divider *= 10;
            System.out.println("Уменьшено до " + divider);
        }
    }
}
