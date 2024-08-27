package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void drawWithMessage(int n) {
        System.out.println("Number pyramid of height " + n + ":");
        draw(n);
    }

    public static void main(String[] args) {
        drawWithMessage(3);
        drawWithMessage(5);
        drawWithMessage(9);
        drawWithMessage(1);
    }
}
