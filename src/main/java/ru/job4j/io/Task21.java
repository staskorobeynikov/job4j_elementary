package ru.job4j.io;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= columnCount; i++) {
            for (int j = 1; j <= columnCount; j++) {
                if (i == 1
                        || i == columnCount
                        || j == i
                        || j == columnCount - i + 1) {
                    result.append(star);
                } else {
                    result.append(space);
                }
            }
            result = new StringBuilder(result.toString().trim());
            if (i != columnCount) {
                result.append(System.lineSeparator());
            }
        }
        System.out.print(result);
    }
}
