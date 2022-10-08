package ru.job4j.condition;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        if (minutes > 60) {
            System.out.println("Расчет не производится");
        } else {
            System.out.printf("Минут: %d, секунд: %d%n", minutes, seconds);
        }
    }
}
