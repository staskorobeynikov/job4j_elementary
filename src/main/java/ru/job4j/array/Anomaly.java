package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                int[] temp = new int[]{i, i};
                while (data[i] <= down || data[i] >= up) {
                    temp[1] = i;
                    i++;
                    if (i > data.length - 1) {
                        break;
                    }
                }
                result[count++] = temp;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
