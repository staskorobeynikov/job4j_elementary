package ru.job4j.algorithm.arrayshash;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        int[] temp = new int[n];
        for (int num : nums) {
            temp[num - 1]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}