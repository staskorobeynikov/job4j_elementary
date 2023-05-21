package ru.job4j.loop;

public class Task103 {
    public static void loop(int[] num) {
        int result = 0;
        int check = Integer.MAX_VALUE;
        for (int number : num) {
            int sum = getSum(number);
            if (check > sum) {
                check = sum;
                result = number;
            }
        }

        System.out.println(result);
    }

    private static int getSum(int number) {
        return number % 10 + number / 10 % 10 + number / 100;
    }
}
