package ru.job4j.loop;

public class Task144 {
    public static void loop(int num1, int num2) {
        while (num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        System.out.println(num1);
    }
}
