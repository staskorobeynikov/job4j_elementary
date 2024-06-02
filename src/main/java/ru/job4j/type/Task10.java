package ru.job4j.type;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = 5.0 * (fahrenheit - 32) / 9.0;
        System.out.printf("%.1f", celsius);
    }
}
