package ru.job4j.loop;

import java.util.StringJoiner;

public class Task152 {
    public static void loop() {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner divideThree = new StringJoiner(" ");
        StringJoiner divideFour = new StringJoiner(" ");
        for (int j = 10; j <= 20; j++) {
            if (j % 2 == 0) {
                even.add(String.valueOf(j));
            }
            if (j % 3 == 0) {
                divideThree.add(String.valueOf(j));
            }
            if (j % 4 == 0) {
                divideFour.add(String.valueOf(j));
            }
        }
        System.out.println(even);
        System.out.println(divideThree);
        System.out.println(divideFour);
    }
}
