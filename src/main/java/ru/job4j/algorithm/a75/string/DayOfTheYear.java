package ru.job4j.algorithm.a75.string;

public class DayOfTheYear {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        boolean isLeapYear =  year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        int februaryDay = isLeapYear ? 29 : 28;
        int[] daysOfMonth = {31, februaryDay, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = day;
        for (int i = 0; i < month - 1; i++) {
            result += daysOfMonth[i];
        }
        return result;
    }
}