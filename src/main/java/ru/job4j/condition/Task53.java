package ru.job4j.condition;

public class Task53 {
    public static void transformFraction(int num1, int num2) {
        int result = num1 / num2;
        int remainder = num1 % num2;
        if (result == 0) {
            System.out.println("Подсчет не производится");
        } else if (remainder == 0) {
            System.out.printf("%d%n", result);
        } else {
            System.out.printf("%d %d/%d%n", result, remainder, num2);
        }
    }
}
