package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if ((i + j) == data.length - 1) {
                    result[i] = data[i][j];
                    break;
                }
            }
        }
        return result;
    }
}
