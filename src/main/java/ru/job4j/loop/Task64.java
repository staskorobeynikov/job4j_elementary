package ru.job4j.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (int month : months) {
            switch (month) {
                case 3, 4, 5 -> spring++;
                case 6, 7, 8 -> summer++;
                case 9, 10, 11 -> fall++;
                default -> winter++;
            }
        }
        System.out.printf(
                "Зимой: %s, Весной: %s, Летом: %s, Осенью: %s%n",
                winter,
                spring,
                summer,
                fall
        );
    }
}
