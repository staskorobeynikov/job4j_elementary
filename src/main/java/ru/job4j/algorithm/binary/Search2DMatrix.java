package ru.job4j.algorithm.binary;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int l = 0;
        int r = n - 1;
        while (top <= bottom) {
            int middle = (top + bottom) / 2;
            if (matrix[middle][n - 1] < target) {
                top = middle + 1;
            } else if (matrix[middle][0] > target) {
                bottom = middle - 1;
            } else {
                break;
            }
        }
        if (!(top <= bottom)) {
            return false;
        }
        int middle = (top + bottom) / 2;
        while (l <= r) {
            int i = (l + r) / 2;
            if (matrix[middle][i] == target) {
                return true;
            }
            if (matrix[middle][i] > target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        return false;
    }
}
