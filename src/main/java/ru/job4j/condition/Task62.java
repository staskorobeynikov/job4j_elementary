package ru.job4j.condition;

import static java.lang.Integer.*;

public class Task62 {
    public static void isRising(int number) {
        String[] strings = String.valueOf(number).split("");
        boolean result = true;
        for (int i = 1; i < strings.length; i++) {
            if (parseInt(strings[i]) < parseInt(strings[i - 1])) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
