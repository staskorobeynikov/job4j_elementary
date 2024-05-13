package ru.job4j.type;

public class Task18 {
    public static int capSum(int tens, int hundreds, int thousands) {
        int sum = 10 * tens + hundreds * 100 + 1000 * thousands;
        return sum;
    }
}
