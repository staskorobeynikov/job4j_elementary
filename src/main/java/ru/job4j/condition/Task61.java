package ru.job4j.condition;

import static java.lang.Integer.*;

public class Task61 {
    public static void hasEqualDigits(int number) {
        String[] strings = String.valueOf(number).split("");
        int counter = 1;
        for (int i = 1; i < strings.length; i++) {
            if (parseInt(strings[i]) == parseInt(strings[0])) {
                counter++;
            }
        }
        if (counter == strings.length) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
