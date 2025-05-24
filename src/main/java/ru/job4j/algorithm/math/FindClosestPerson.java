package ru.job4j.algorithm.math;

public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int firstDistance = Math.abs(x - z);
        int secondDistance = Math.abs(y - z);
        if (firstDistance < secondDistance) {
            return 1;
        } else if (firstDistance > secondDistance) {
            return 2;
        } else {
            return 0;
        }
    }
}