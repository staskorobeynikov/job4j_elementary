package ru.job4j.loop;

public class Task174 {
    public static void isPalindrome(int number) {
        int copy = number;
        int reverted = 0;
        while (number > reverted) {
            reverted = reverted * 10 + number % 10;
            number /= 10;
        }
        if (copy % 10 == 0) {
            System.out.println("Нет");
        } else {
            if (reverted == number || number == reverted / 10) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
