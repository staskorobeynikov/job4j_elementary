package ru.job4j.algorithm.math;

public class MinimumMovesToReachTargetScore {
    public int minMoves(int target, int maxDoubles) {
        int result = 0;
        while (maxDoubles > 0 && target > 1) {
            result++;
            if ((target & 1 ^ 1) == 0) {
                target--;
            } else {
                target /= 2;
                maxDoubles--;
            }
        }
        result += target - 1;
        return result;
    }
}
