package ru.job4j.condition;

public class Task73 {
    public static void midDigitLess(int num) {
        String[] strings = String.valueOf(num).split("");
        if (
                Integer.parseInt(strings[1]) < Integer.parseInt(strings[0])
                        && Integer.parseInt(strings[1]) < Integer.parseInt(strings[2])
        ) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
