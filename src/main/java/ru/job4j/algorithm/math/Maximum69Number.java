package ru.job4j.algorithm.math;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String numberAsString = String.valueOf(num);
        String modifiedNumber = numberAsString.replaceFirst("6", "9");
        return Integer.parseInt(modifiedNumber);
    }
}
