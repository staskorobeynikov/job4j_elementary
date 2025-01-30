package ru.job4j.algorithm.a75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

    @Test
    void testExampleCase1() {
        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        int n = 6;
        int[][] connections = {
                {0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}
        };
        assertEquals(3, solution.minReorder(n, connections), "Expected 3 roads to be reordered");
    }

    @Test
    void testExampleCase2() {
        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        int n = 5;
        int[][] connections = {
                {1, 0}, {1, 2}, {3, 2}, {3, 4}
        };
        assertEquals(2, solution.minReorder(n, connections), "Expected 2 roads to be reordered");
    }

    @Test
    void testAllReversed() {
        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        int n = 4;
        int[][] connections = {
                {1, 0}, {2, 0}, {3, 0}
        };
        assertEquals(0, solution.minReorder(n, connections), "Expected 0 roads to be reordered since all are already directed towards 0");
    }

    @Test
    void testAllNeedReordering() {
        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        int n = 4;
        int[][] connections = {
                {0, 1}, {1, 2}, {2, 3}
        };
        assertEquals(3, solution.minReorder(n, connections), "Expected 3 roads to be reordered");
    }

    @Test
    void testMinimalCase() {
        ReorderRoutesToMakeAllPathsLeadToTheCityZero solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();
        int n = 2;
        int[][] connections = {
                {0, 1}
        };
        assertEquals(1, solution.minReorder(n, connections), "Expected 1 road to be reordered");
    }
}
