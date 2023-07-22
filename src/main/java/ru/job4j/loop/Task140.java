package ru.job4j.loop;

public class Task140 {
    public static void loop(int num) {
        int check = num;
        num--;
        while (num > 1) {
            if (check % num == 0) {
                break;
            }
            num--;
        }
        System.out.println(num);
    }
}
