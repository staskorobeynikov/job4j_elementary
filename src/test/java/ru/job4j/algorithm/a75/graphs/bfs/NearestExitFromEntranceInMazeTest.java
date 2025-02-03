package ru.job4j.algorithm.a75.graphs.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearestExitFromEntranceInMazeTest {
    @Test
    void testSimpleExit() {
        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();
        char[][] maze = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '+'}
        };
        int[] entrance = {1, 2};
        assertEquals(1, solution.nearestExit(maze, entrance), "Expected 1 step to nearest exit");
    }

    @Test
    void testMultiplePaths() {
        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();
        char[][] maze = {
                {'+', '+', '+', '+'},
                {'.', '.', '.', '+'},
                {'+', '.', '+', '.'},
                {'+', '.', '+', '+'}
        };
        int[] entrance = {1, 0};
        assertEquals(3, solution.nearestExit(maze, entrance), "Expected 3 steps to nearest exit");
    }

    @Test
    void testNoExitAvailable() {
        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();
        char[][] maze = {
                {'+', '+', '+', '+'},
                {'+', '.', '.', '+'},
                {'+', '+', '+', '+'}
        };
        int[] entrance = {1, 1};
        assertEquals(-1, solution.nearestExit(maze, entrance), "Expected -1 since no exit is reachable");
    }

    @Test
    void testAlreadyAtExit() {
        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();
        char[][] maze = {
                {'.', '+'},
                {'+', '+'}
        };
        int[] entrance = {0, 0};
        assertEquals(-1, solution.nearestExit(maze, entrance), "Expected -1 since entrance is at an exit position");
    }

    @Test
    void testMazeWithSingleExit() {
        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();
        char[][] maze = {
                {'+', '.', '+', '+', '+'},
                {'+', '.', '.', '.', '+'},
                {'+', '+', '+', '.', '+'}
        };
        int[] entrance = {1, 2};
        assertEquals(2, solution.nearestExit(maze, entrance), "Expected 2 steps to reach the exit");
    }

    @Test
    void testComplexMaze() {
        NearestExitFromEntranceInMaze solution = new NearestExitFromEntranceInMaze();
        char[][] maze = {
                {'+', '.', '+', '+', '+', '+', '+'},
                {'+', '.', '+', '.', '.', '.', '+'},
                {'+', '.', '+', '.', '+', '.', '+'},
                {'+', '.', '.', '.', '+', '.', '+'},
                {'+', '+', '+', '+', '+', '.', '+'}
        };
        int[] entrance = {1, 1};
        assertEquals(1, solution.nearestExit(maze, entrance), "Expected 1 steps to reach the exit");
    }
}