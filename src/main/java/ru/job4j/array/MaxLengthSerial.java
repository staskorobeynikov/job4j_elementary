package ru.job4j.array;

public class MaxLengthSerial {
    public static int find(int[] array) {
        int rsl = 1;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            count = array[i + 1] >= array[i] ? count + 1 : 1;
            if (count > rsl) {
                rsl = count;
            }
        }
        return rsl;
    }
}
