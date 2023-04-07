package ru.job4j.loop;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        for (int i = 0; i < coords.length; i += 2) {
            int check = (x - coords[i]) * (x - coords[i]) + (y - coords[i + 1]) * (y - coords[i + 1]);
            if (check == r * r) {
                on++;
            } else if (check < r * r) {
                in++;
            }
        }
        System.out.printf("На окружности: %s, внутри: %s%n", on, in);
    }
}
