package ru.job4j.algorithm.a75.graphs.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {

    @Test
    void testSingleProvince() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        assertEquals(2, provinces.findCircleNum(isConnected), "Expected 2 provinces");
    }

    @Test
    void testAllConnected() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(1, provinces.findCircleNum(isConnected), "Expected 1 province");
    }

    @Test
    void testNoConnections() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertEquals(3, provinces.findCircleNum(isConnected), "Expected 3 provinces");
    }

    @Test
    void testDisconnectedGraph() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, 1}
        };
        assertEquals(2, provinces.findCircleNum(isConnected), "Expected 2 provinces");
    }

    @Test
    void testSingleCity() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1}
        };
        assertEquals(1, provinces.findCircleNum(isConnected), "Expected 1 province for single city");
    }

    @Test
    void testTwoCitiesDisconnected() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 0},
                {0, 1}
        };
        assertEquals(2, provinces.findCircleNum(isConnected), "Expected 2 provinces for disconnected cities");
    }

    @Test
    void testTwoCitiesConnected() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        int[][] isConnected = {
                {1, 1},
                {1, 1}
        };
        assertEquals(1, provinces.findCircleNum(isConnected), "Expected 1 province for connected cities");
    }
}
