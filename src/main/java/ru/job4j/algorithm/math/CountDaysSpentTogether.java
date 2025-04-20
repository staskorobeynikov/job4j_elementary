package ru.job4j.algorithm.math;

public class CountDaysSpentTogether {
    private final int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(
            String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String laterArrival = arriveAlice.compareTo(arriveBob) < 0 ? arriveBob : arriveAlice;
        String earlierLeave = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;
        int start = convertToDateInYear(laterArrival);
        int end = convertToDateInYear(earlierLeave);
        return Math.max(end - start + 1, 0);
    }

    private int convertToDateInYear(String date) {
        int monthIndex = Integer.parseInt(date.substring(0, 2)) - 1;
        int dayOfYear = 0;
        for (int i = 0; i < monthIndex; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += Integer.parseInt(date.substring(3));
        return dayOfYear;
    }
}
