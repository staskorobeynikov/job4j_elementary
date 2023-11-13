package ru.job4j.condition;

import java.util.StringJoiner;

public class Task57 {
    private static final int SUM_OF_ANGLES = 180;

    private static final int RIGHT_ANGLE = 90;

    public static void triangleType(int a, int b) {
        StringJoiner buffer = new StringJoiner(" ");
        int c = SUM_OF_ANGLES - a - b;
        if (a < RIGHT_ANGLE && b < RIGHT_ANGLE && c < RIGHT_ANGLE) {
            buffer.add("Остроугольный");

        }
        if (a == RIGHT_ANGLE || b == RIGHT_ANGLE || c == RIGHT_ANGLE) {
            buffer.add("Прямоугольный");
        }
        if ((a > RIGHT_ANGLE || b > RIGHT_ANGLE || c > RIGHT_ANGLE) && c > 0) {
            buffer.add("Тупоугольный");
        }
        if (a == b || b == c || c == a) {
            buffer.add("Равнобедренный");
        }
        if (b == c && c == a) {
            buffer.add("Равносторонний");
        }
        if (c < 0) {
            buffer.add("Ошибка");
        }
        System.out.println(buffer);
    }
}
