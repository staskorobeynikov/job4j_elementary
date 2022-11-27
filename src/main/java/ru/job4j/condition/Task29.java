package ru.job4j.condition;

public class Task29 {
    public static void triangleCheck(double side1, double side2, double hypotenuse) {
        double sum = getSquared(side1) + getSquared(side2);
        if (sum == getSquared(hypotenuse)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    private static double getSquared(double i) {
        return Math.pow(i, 2);
    }
}
