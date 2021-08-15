package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean divideHundred = year % 100 == 0;
        boolean divideFourHundred = year % 400 == 0;
        boolean divideFour = year % 4 == 0;
        if (divideFourHundred) {
            return true;
        }
        if (divideHundred) {
            return false;
        }
        return divideFour;
    }
}
