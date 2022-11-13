package ru.job4j.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int first = getLastNumber(num1);
        int second = getLastNumber(num2);
        if (first > second) {
            System.out.println(first);
        } else if (first < second) {
            System.out.println(second);
        } else {
            System.out.println("Одинаковые");
        }
    }

    private static int getLastNumber(int num1) {
        String[] numbers = String.valueOf(num1).split("");
        return Integer.parseInt(numbers[numbers.length - 1]);
    }
}
