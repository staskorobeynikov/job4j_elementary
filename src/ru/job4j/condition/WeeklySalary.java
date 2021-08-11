package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int i = 0; i < hours.length; i++) {
            int check = hours[i];
            int amount;
            if (i < 5) {
                amount = check > 8 ? (check - 8) * 15 + 8 * 10 : check * 10;
            } else {
                amount = check > 8 ? 2 * ((check - 8) * 15 + 8 * 10) : 2 * check * 10;
            }
            rsl += amount;
        }
        return rsl;
    }
}
