package ru.job4j.loop;

public class Task105 {
    public static void loop(int[] num) {
        int result = -1;
        int check = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int sum = getSum(num[i]);
            if (sum > check) {
                check = sum;
                result = i;
            }
        }
        System.out.println(result);
    }

    private static int getSum(int number) {
        return number % 10 + number / 10 % 10 + number / 100;
    }
}
