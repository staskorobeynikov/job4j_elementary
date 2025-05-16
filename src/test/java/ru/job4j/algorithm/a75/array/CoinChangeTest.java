package ru.job4j.algorithm.a75.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void testSimpleCase() {
        CoinChange solver = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;
        assertEquals(3, solver.coinChange(coins, amount));
    }

    @Test
    void testExactMatch() {
        CoinChange solver = new CoinChange();
        int[] coins = {2};
        int amount = 4;
        assertEquals(2, solver.coinChange(coins, amount));
    }

    @Test
    void testNoSolution() {
        CoinChange solver = new CoinChange();
        int[] coins = {2};
        int amount = 3;
        assertEquals(-1, solver.coinChange(coins, amount));
    }

    @Test
    void testZeroAmount() {
        CoinChange solver = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 0;
        assertEquals(0, solver.coinChange(coins, amount));
    }

    @Test
    void testSingleCoinLargeAmount() {
        CoinChange solver = new CoinChange();
        int[] coins = {1};
        int amount = 10000;
        assertEquals(10000, solver.coinChange(coins, amount));
    }

    @Test
    void testMaxCoinsLength() {
        CoinChange solver = new CoinChange();
        int[] coins = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int amount = 15;
        assertEquals(2, solver.coinChange(coins, amount));
    }

    @Test
    void testLargeCoinNoMatch() {
        CoinChange solver = new CoinChange();
        int[] coins = {10000};
        int amount = 9999;
        assertEquals(-1, solver.coinChange(coins, amount));
    }

    @Test
    void testLargeCoinExactMatch() {
        CoinChange solver = new CoinChange();
        int[] coins = {10000};
        int amount = 10000;
        assertEquals(1, solver.coinChange(coins, amount));
    }

    @Test
    void testUnorderedCoins() {
        CoinChange solver = new CoinChange();
        int[] coins = {5, 1, 2};
        int amount = 7;
        assertEquals(2, solver.coinChange(coins, amount));
    }
}