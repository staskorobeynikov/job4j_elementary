package ru.job4j.condition;

public class Task64 {
    public static void gradePrint(int number) {
        switch (number) {
            case 1, 2 -> System.out.println("Плохо");
            case 3 -> System.out.println("Удовлетворительно");
            case 4 -> System.out.println("Хорошо");
            case 5 -> System.out.println("Отлично");
            default -> System.out.println("Не соответствует");
        }
    }
}
