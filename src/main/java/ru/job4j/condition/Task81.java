package ru.job4j.condition;

import static java.lang.Character.*;

public class Task81 {
    public static void isLatin(char s) {
        if (isUpperCase(s) || isLowerCase(s)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
