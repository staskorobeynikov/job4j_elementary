package ru.job4j.algorithm.math;

public class NumberOfDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(calculateDays(date1) - calculateDays(date2));
    }

    private int calculateDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        int totalDays = 0;
        for (int i = 1971; i < year; i++) {
            totalDays += isLeapYear(i) ? 366 : 365;
        }
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth(i, year);
        }
        totalDays += day;
        return totalDays;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    private int daysInMonth(int month, int year) {
        int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        daysInMonth[1] += isLeapYear(year) ? 1 : 0;
        return daysInMonth[month - 1];
    }
}
