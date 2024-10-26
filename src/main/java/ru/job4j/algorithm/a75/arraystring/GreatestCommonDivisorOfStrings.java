package ru.job4j.algorithm.a75.arraystring;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, getLength(str1.length(), str2.length()));
    }

    private  static int getLength(int i, int j) {
        return j == 0 ? i : getLength(j, i % j);
    }
}
