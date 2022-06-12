package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        String[] strings = String.valueOf(num).split("");
        for (String string : strings) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }
}
