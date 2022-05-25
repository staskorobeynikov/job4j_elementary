package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String[] temp = String.valueOf(number).split("");
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = Integer.parseInt(temp[temp.length - 1 - i]);
        }
        return result;
    }
}
