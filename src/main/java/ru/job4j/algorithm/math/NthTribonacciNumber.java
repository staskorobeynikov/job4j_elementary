package ru.job4j.algorithm.math;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int first = 0, second = 1, third = 1;
        while (n > 0) {
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
            n--;
        }
        return first;
    }
}
