package ru.job4j.loop;

public class Task143 {
    public static void loop(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        System.out.println(num1 + num2);
    }
}
