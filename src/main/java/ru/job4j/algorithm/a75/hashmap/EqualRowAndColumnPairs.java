package ru.job4j.algorithm.a75.hashmap;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int rows = grid.length;
        int result = 0;
        int[][] table = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                table[i][j] = grid[j][i];
            }
        }
        for (int[] row : grid) {
            for (int[] column : table) {
                int equal = 1;
                for (int i = 0; i < grid.length; i++) {
                    if (row[i] != column[i]) {
                        equal = 0;
                        break;
                    }
                }
                result += equal;
            }
        }
        return result;
    }
}
