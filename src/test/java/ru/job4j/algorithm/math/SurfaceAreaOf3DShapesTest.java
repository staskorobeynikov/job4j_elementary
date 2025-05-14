package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SurfaceAreaOf3DShapesTest {

    @Test
    void testMinValues() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int[][] grid = {{0}};
        assertEquals(0, solver.surfaceArea(grid));
    }

    @Test
    void testOneCube() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int[][] grid = {{1}};
        assertEquals(6, solver.surfaceArea(grid));
    }

    @Test
    void testMaxHeightSingleCell() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int[][] grid = {{50}};
        assertEquals(202, solver.surfaceArea(grid));
    }

    @Test
    void testMaxGridAllZero() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int[][] grid = new int[50][50];
        assertEquals(0, solver.surfaceArea(grid));
    }

    @Test
    void testMaxGridAllOnes() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int n = 50;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 1;
            }
        }
        /*
        int expected = 6 * n * n - 4 * n * (n - 1);
         */
        int expected = 5200;
        assertEquals(expected, solver.surfaceArea(grid));
    }

    @Test
    void testMaxGridAllMaxHeights() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int n = 50;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 50;
            }
        }
        /*
        int total = 202 * n * n - 4 * 50 * n * (n - 1);
         */
        int total = 15000;
        assertEquals(total, solver.surfaceArea(grid));
    }

    @Test
    void testRandomSmallGrid() {
        SurfaceAreaOf3DShapes solver = new SurfaceAreaOf3DShapes();
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        assertEquals(34, solver.surfaceArea(grid));
    }
}

