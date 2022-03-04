package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int i = 0;
        while (i < row) {
            array[i][column] = array[i + 1][column];
            i++;
        }
        i = array.length - 1;
        while (i > row) {
            array[i][column] = array[i - 1][column];
            i--;
        }
        i = 0;
        while (i < column) {
            array[row][i] = array[row][i + 1];
            i++;
        }
        i = array.length - 1;
        while (i > column) {
            array[row][i] = array[row][i - 1];
            i--;
        }
        array[row][column] = 0;
    }
}
