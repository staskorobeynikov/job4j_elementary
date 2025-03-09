package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeInDiagonalTest {

    @Test
    void testSingleElementPrime() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {{7}};
        assertEquals(7, solver.diagonalPrime(nums), "Expected 7 for a single prime element matrix.");
    }

    @Test
    void testSingleElementNonPrime() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {{4}};
        assertEquals(0, solver.diagonalPrime(nums), "Expected 0 for a single non-prime element matrix.");
    }

    @Test
    void testSmallMatrixWithPrimeDiagonal() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {
                {3, 4},
                {5, 7}
        };
        assertEquals(7, solver.diagonalPrime(nums), "Expected 7 as the largest prime in the diagonal.");
    }

    @Test
    void testSmallMatrixWithoutPrimeDiagonal() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {
                {4, 6},
                {8, 9}
        };
        assertEquals(0, solver.diagonalPrime(nums), "Expected 0 as no diagonal numbers are prime.");
    }

    @Test
    void testLargerMatrixWithMultiplePrimes() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {
                {2, 15, 17},
                {6, 11, 5},
                {23, 10, 29}
        };
        assertEquals(29, solver.diagonalPrime(nums), "Expected 29 as the largest prime in the diagonals.");
    }

    @Test
    void testLargerMatrixWithNoPrimes() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {
                {4, 6, 8},
                {10, 12, 14},
                {16, 18, 20}
        };
        assertEquals(0, solver.diagonalPrime(nums), "Expected 0 as no prime numbers are present in diagonals.");
    }

    @Test
    void testMatrixWithMixedPrimeAndNonPrimeNumbers() {
        PrimeInDiagonal solver = new PrimeInDiagonal();
        int[][] nums = {
                {19, 8, 21},
                {10, 13, 6},
                {5, 2, 11}
        };
        assertEquals(19, solver.diagonalPrime(nums), "Expected 19 as the largest prime number in the diagonal.");
    }
}
