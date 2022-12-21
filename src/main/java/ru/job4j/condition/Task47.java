package ru.job4j.condition;

public class Task47 {
    public static void changeNum(int number) {
        int hundred = number / 100;
        int ten = number / 10 % 10;
        int one = number % 10;
        if (number > 500) {
            if (ten != 0 && one != 0) {
                System.out.printf("%d%d%d%n", one, ten, hundred);
            } else if (ten != 0) {
                System.out.printf("%d%d%n", ten, hundred);
            } else {
                System.out.println(hundred);
            }
        } else {
            System.out.printf("%d%d%d%n", hundred, one, ten);
        }
    }
}
