package ru.job4j.algorithm.a75.graphs.bfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RottingOrangesTest {

    @Test
    void testAllOrangesAlreadyRotten() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };
        assertEquals(0, solution.orangesRotting(grid), "Expected 0 minutes since all oranges are already rotten");
    }

    @Test
    void testNoRottenOranges() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(-1, solution.orangesRotting(grid), "Expected -1 since there are no rotten oranges to spread the rot");
    }

    @Test
    void testMixedOranges() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, solution.orangesRotting(grid), "Expected 4 minutes for all oranges to rot");
    }

    @Test
    void testSomeOrangesNeverRot() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 0}
        };
        assertEquals(-1, solution.orangesRotting(grid), "Expected -1 since some oranges cannot be reached");
    }

    @Test
    void testEmptyGrid() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertEquals(0, solution.orangesRotting(grid), "Expected 0 since there are no oranges to rot");
    }

    @Test
    void testMinimalCaseOneFreshOrange() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {1}
        };
        assertEquals(-1, solution.orangesRotting(grid), "Expected -1 since there are no rotten oranges to spread the rot");
    }

    @Test
    void testMinimalCaseOneRottenOrange() {
        RottingOranges solution = new RottingOranges();
        int[][] grid = {
                {2}
        };
        assertEquals(0, solution.orangesRotting(grid), "Expected 0 since the only orange is already rotten");
    }
}
