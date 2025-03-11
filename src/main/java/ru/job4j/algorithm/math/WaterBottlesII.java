package ru.job4j.algorithm.math;

public class WaterBottlesII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        while (numBottles >= numExchange) {
            numBottles -= numExchange;
            numExchange++;
            totalDrunk++;
            numBottles++;
        }
        return totalDrunk;
    }
}
