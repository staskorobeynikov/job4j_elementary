package ru.job4j.algorithm.math;

public class TotalDistanceTraveled {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int result = 0;
        int moves = 0;
        while (mainTank > 0) {
            moves++;
            result += 10;
            mainTank--;
            if (moves % 5 == 0 && additionalTank > 0) {
                additionalTank--;
                mainTank++;
            }
        }
        return result;
    }
}