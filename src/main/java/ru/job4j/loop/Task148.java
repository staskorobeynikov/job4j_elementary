package ru.job4j.loop;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int groups = 0;
        int allAdults = 0;
        int allChildren = 0;
        for (int i = 0; i < cNum.length; i++) {
            if (children - cNum[i] < 0 || adults - aNum[i] < 0) {
                break;
            }
            if (children - cNum[i] >= 0 && adults - aNum[i] >= 0) {
                children -= cNum[i];
                allChildren += cNum[i];
                adults -= aNum[i];
                allAdults += aNum[i];
                groups++;
            }
        }
        System.out.printf(
                "Группы: %s, Взрослых: %s, детей: %s, осталось билетов взр: %s, осталось билетов дет: %s%n",
                groups, allAdults, allChildren, adults, children
        );
    }
}
