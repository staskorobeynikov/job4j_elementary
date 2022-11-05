package ru.job4j.condition;

public class Task58 {
    public static void isWinning(int number) {
        int start = 0;
        int last = 0;
        String[] temp = String.valueOf(number).split("");
        for (int i = 0; i < temp.length / 2; i++) {
            start += Integer.parseInt(temp[i]);
            last += Integer.parseInt(temp[temp.length - i - 1]);
        }
        if (start == last && start % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
