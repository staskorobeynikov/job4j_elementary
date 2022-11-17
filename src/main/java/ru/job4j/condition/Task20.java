package ru.job4j.condition;

public class Task20 {
    public static void numCheck(int number) {
        String value = String.valueOf(number);
        boolean check = true;
        for (String s : value.split("")) {
            if (Integer.parseInt(s) % 2 != 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
