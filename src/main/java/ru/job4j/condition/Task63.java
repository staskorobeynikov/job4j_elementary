package ru.job4j.condition;

public class Task63 {
    public static void isDecreasing(int number) {
        String[] numbers = String.valueOf(number).split("");
        boolean check = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (Integer.parseInt(numbers[i]) < Integer.parseInt(numbers[i + 1])) {
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
