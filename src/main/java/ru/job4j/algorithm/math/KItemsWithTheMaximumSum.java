package ru.job4j.algorithm.math;

public class KItemsWithTheMaximumSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        }
        k -= numOnes;
        if (k <= numZeros) {
            return numOnes;
        }
        k -= numZeros;
        if (k <= numNegOnes) {
            return numOnes - k;
        }
        return 0;
    }
}
