package ru.job4j.algorithm.math;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = getSum(slow);
            fast = getSum(getSum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private int getSum(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }
}
