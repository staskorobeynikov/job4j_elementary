package ru.job4j.first;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
         /* периметр квадрата */
        double perimeter = 4 * a;
        System.out.printf("%.1f%n", perimeter);
        /* длина окружности */
        double length = 2 * Math.PI * r;
        System.out.printf("%.1f%n", length);
        /* площадь круга */
        double area = Math.PI * r * r;
        System.out.printf("%.1f%n", area);
    }
}
