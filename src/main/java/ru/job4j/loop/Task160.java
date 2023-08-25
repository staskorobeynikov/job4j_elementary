package ru.job4j.loop;

public class Task160 {
    public static void loop(int num) {
        int result = 0;
        int value = getSum(num);
        for (int i = num + 1; i < Integer.MAX_VALUE; i++) {
            if (value == i && getSum(i) == num) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static int getSum(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result;
    }
}
