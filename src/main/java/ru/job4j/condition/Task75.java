package ru.job4j.condition;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        int counter = 0;
        for (int number : getTwoDigitNumber(num4)) {
            if (number == num2) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static int[] getTwoDigitNumber(int number) {
        int first = number / 100;
        int middle = number / 10 % 100;
        int last = number % 100;
        return new int[]{first, middle, last};
    }
}
