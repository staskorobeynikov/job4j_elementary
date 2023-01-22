package ru.job4j.loop;

public class Task22 {
    public static void loop() {
        StringBuilder result = new StringBuilder();
        for (int i = 100; i < 300; i++) {
            if (i % 80 == 45) {
                result.append(i);
                result.append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
