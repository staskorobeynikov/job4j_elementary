package ru.job4j.loop;

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        int[] sums = {
                printInfoAndGetSum(num1),
                printInfoAndGetSum(num2),
                printInfoAndGetSum(num3)
        };
        int result = 0;
        for (int sum : sums) {
            result += sum;
        }
        System.out.printf("Сумма всех цифр: %s%n", result);
    }

    private static int printInfoAndGetSum(int number) {
        int count = getCountNumbers(number);
        int sum = getSum(number);
        int dividers = getCountDividers(number);
        System.out.printf("Цифр: %s, сумма цифр: %s, делителей: %s%n", count, sum, dividers);
        return sum;
    }

    private static int getCountNumbers(int number) {
        int result = 0;
        while (number > 0) {
            result++;
            number /= 10;
        }
        return result;
    }

    private static int getSum(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    private static int getCountDividers(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }
}
