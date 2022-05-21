package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int size = (int) Math.pow(data.length, 2);
        int[] result = new int[size];
        int index = 0;
        for (int[] row : data) {
            for (int j = 0; j < data.length; j++) {
                result[index++] = row[j];
            }
        }
        return result;
    }
}
