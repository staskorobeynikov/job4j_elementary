package ru.job4j.algorithm.a75.array;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int number = 1 << 30;
        int[] temp = new int[amount + 1];
        Arrays.fill(temp, number);
        temp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                temp[i] = Math.min(temp[i], temp[i - coin] + 1);
            }
        }
        return temp[amount] >= number ? -1 : temp[amount];
    }
}