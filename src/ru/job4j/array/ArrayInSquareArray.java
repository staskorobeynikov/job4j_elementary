package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            int check = (int) Math.pow(i, 2);
            if (check >= array.length) {
                size = i;
                break;
            }
        }
        int[][] rsl = new int[size][size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int add = k >= array.length ? 0 : array[k];
                rsl[i][j] = add;
                k++;
            }
        }
        return rsl;
    }
}
