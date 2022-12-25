package ru.job4j.condition;

public class Task49 {
    public static void isPalindrome(int number) {
        String value = String.valueOf(number);
        boolean check = true;
        for (int i = 0; i < value.length() / 2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
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
