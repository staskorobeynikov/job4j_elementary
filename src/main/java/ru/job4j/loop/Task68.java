package ru.job4j.loop;

public class Task68 {
    public static void loop(int num1, int num2) {
        System.out.println(getCounter(num1) != getCounter(num2) ? "Нет" : "Да");
    }

    private static int getCounter(int number) {
        int result = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }
}
