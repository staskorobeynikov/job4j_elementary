package ru.job4j.condition;

public class Task65 {
    public static void season(int number) {
        switch (number) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default ->  System.out.println("Не является месяцем");
        }
    }
}
