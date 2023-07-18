package ru.job4j.loop;

public class Task138 {
    public static void loop() {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            int check = i / 10 + i % 10;
            if (i % check == 0) {
                result = i;
            }
        }
        System.out.println(result);
    }
}
