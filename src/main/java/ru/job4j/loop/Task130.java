package ru.job4j.loop;

public class Task130 {
    public static void loop(int num) {
        int counter = 0;
        while (num > 0) {
            int number = num % 10;
            if (number == 0) {
                counter++;
            }
            num /= 10;
        }
        System.out.println(counter);
    }
}
