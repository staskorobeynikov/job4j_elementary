package ru.job4j.algorithm.math;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SeparateTheDigitsInAnArray {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            LinkedList<Integer> digits = new LinkedList<>();
            while (num > 0) {
                digits.addFirst(num % 10);
                num /= 10;
            }
            temp.addAll(digits);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
