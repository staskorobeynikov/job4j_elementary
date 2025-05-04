package ru.job4j.algorithm.a75.string;

public class MinimumNumberOfOperationsToConvertTime {
    public int convertTime(String current, String correct) {
        int[] intervals = {60, 15, 5, 1};
        int interval = getMinutes(correct) - getMinutes(current);
        int index = 0;
        int result = 0;
        while (interval > 0) {
            if (interval >= intervals[index]) {
                interval -= intervals[index];
                result++;
            } else {
                index++;
            }
        }
        return result;
    }

    private int getMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        return hours * 60 + minutes;
    }
}
