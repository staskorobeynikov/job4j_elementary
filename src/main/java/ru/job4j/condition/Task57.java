package ru.job4j.condition;

public class Task57 {
    private static final int SUM_OF_ANGLES = 180;

    private static final int RIGHT_ANGLE = 90;

    public static void triangleType(int a, int b) {
        int c = SUM_OF_ANGLES - a - b;
        if (a < RIGHT_ANGLE && b < RIGHT_ANGLE && c < RIGHT_ANGLE) {
            System.out.println("Остроугольный");
        }
        if (a == RIGHT_ANGLE || b == RIGHT_ANGLE || c == RIGHT_ANGLE) {
            System.out.println("Прямоугольный");
        }
        if ((a > RIGHT_ANGLE || b > RIGHT_ANGLE || c > RIGHT_ANGLE) && c > 0) {
            System.out.println("Тупоугольный");
        }
        if (a == b || b == c || c == a) {
            System.out.println("Равнобедренный");
        }
        if (b == c && c == a) {
            System.out.println("Равносторонний");
        }
        if (c < 0) {
            System.out.println("Ошибка");
        }
    }
}
