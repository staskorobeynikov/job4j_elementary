package ru.job4j.algorithm.math;

import java.util.Arrays;

public class FindTheCountOfNumbersWhichAreNotSpecial {
    public int nonSpecialCount(int l, int r) {
        int m = (int) Math.floor(Math.sqrt(r));
        boolean[] primes = new boolean[m + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i <= m; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= m; j += i) {
                    primes[j] = false;
                }
            }
        }
        int low = (int) Math.ceil(Math.sqrt(l));
        int count = 0;
        for (int i = low; i <= m; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return r - l + 1 - count;
    }
}
