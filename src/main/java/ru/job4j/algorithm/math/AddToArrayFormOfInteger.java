package ru.job4j.algorithm.math;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        int carry = 0;
        LinkedList<Integer> result = new LinkedList<>();
        while (n >= 0 || k > 0 || carry > 0) {
            carry += (n < 0 ? 0 : num[n--]) + k % 10;
            result.addFirst(carry % 10);
            k /= 10;
            carry /= 10;
        }
        return result;
    }
}
