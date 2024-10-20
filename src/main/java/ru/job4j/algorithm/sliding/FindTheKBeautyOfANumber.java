package ru.job4j.algorithm.sliding;

public class FindTheKBeautyOfANumber {
    public static int divisorSubstrings(int num, int k) {
        int result = 0;
        String s = String.valueOf(num);
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (r - l + 1 > k) {
                l++;
            }
            if (r - l + 1 == k) {
                int i = Integer.parseInt(s.substring(l, r + 1));
                if (i != 0) {
                    if (num % i == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
