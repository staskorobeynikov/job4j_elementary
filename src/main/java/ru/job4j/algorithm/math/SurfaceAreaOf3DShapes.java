package ru.job4j.algorithm.math;

public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    result += 2 + grid[i][j] * 4;
                    if (i > 0) {
                        result -= Math.min(grid[i - 1][j], grid[i][j]) * 2;
                    }
                    if (j > 0) {
                        result -= Math.min(grid[i][j - 1], grid[i][j]) * 2;
                    }
                }
            }
        }
        return result;
    }
}
