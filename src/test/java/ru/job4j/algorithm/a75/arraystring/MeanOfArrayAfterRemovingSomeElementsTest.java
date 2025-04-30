package ru.job4j.algorithm.a75.arraystring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MeanOfArrayAfterRemovingSomeElementsTest {

    @Test
    void testUniformArray() {
        MeanOfArrayAfterRemovingSomeElements solver = new MeanOfArrayAfterRemovingSomeElements();
        int[] arr = new int[20];
        Arrays.fill(arr, 100);
        assertEquals(100.0, solver.trimMean(arr), 1e-6, "Expected mean to be 100.0 for uniform array.");
    }

    @Test
    void testTrimOutliersFromBothEnds() {
        MeanOfArrayAfterRemovingSomeElements solver = new MeanOfArrayAfterRemovingSomeElements();
        int[] arr = {1, 2, 3, 4, 5, 1000, 6, 7, 8, 9, 10, 11, 12, 10000, 13, 14, 15, 16, 17, 18};
        assertEquals(65.0, solver.trimMean(arr), 1e-5, "Expected trimmed mean excluding outliers.");
    }

    @Test
    void testAllDifferentValues() {
        MeanOfArrayAfterRemovingSomeElements solver = new MeanOfArrayAfterRemovingSomeElements();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) arr[i] = i + 1;
        assertEquals(10.5, solver.trimMean(arr), 1e-6, "Expected mean of numbers 2 to 19.");
    }

    @Test
    void testLargeArray() {
        MeanOfArrayAfterRemovingSomeElements solver = new MeanOfArrayAfterRemovingSomeElements();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) arr[i] = i + 1;
        assertEquals(50.5, solver.trimMean(arr), 1e-6, "Expected mean of numbers 6 to 95.");
    }

    @Test
    void testWithDuplicatesAndOutliers() {
        MeanOfArrayAfterRemovingSomeElements solver = new MeanOfArrayAfterRemovingSomeElements();
        int[] arr = {100, 100, 100, 100, 100, 0, 0, 0, 0, 0, 200, 200, 200, 200, 200, 100, 100, 100, 100, 100};
        assertEquals(100.0, solver.trimMean(arr), 1e-6, "Expected mean after trimming symmetric outliers.");
    }

    @Test
    void testPrecisionHandling() {
        MeanOfArrayAfterRemovingSomeElements solver = new MeanOfArrayAfterRemovingSomeElements();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) arr[i] = 1000000 + i;
        assertEquals(1000009.5, solver.trimMean(arr), 1e-6, "Expected precise trimmed mean.");
    }
}
