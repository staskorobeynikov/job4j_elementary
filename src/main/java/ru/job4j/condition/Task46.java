package ru.job4j.condition;

public class Task46 {
    public static void changeNums(int num1, int num2) {
        if (num1 != num2) {
            if (num1 > num2) {
                num1 -= 1;
                num2 += 1;
            } else {
                num1 += 1;
                num2 -= 1;
            }
        } else {
            num1 += 1;
            num2 += 1;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
