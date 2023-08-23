package ru.job4j.loop;

public class Task159 {

    public static final int LIMIT = 10000;

    public static void loop() {
        int max = 0;
        int result = 1;
        for (int i = 1; i <= LIMIT; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > max) {
                max = sum;
                result = i;
            }
        }
        System.out.println(result);
    }
}
