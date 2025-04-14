package ru.job4j.algorithm.a75.string;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int num : nums) {
            result.add(String.valueOf(num));
        }
        result.sort((a, b) -> (b + a).compareTo(a + b));
        if ("0".equals(result.get(0))) {
            return "0";
        }
        return String.join("", result);
    }
}
