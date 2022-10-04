package ru.job4j.condition;

public class Task78 {
    public static void divWithoutRemainder1(int num) {
        int first = num / 100;
        int second = (num - first * 100) / 10;
        int third = num - first * 100 - second * 10;
        String result = "";
        if (first != 0 && num % first == 0) {
            result = "" + first;
        }
        if (second != 0 && num % second == 0) {
            result += "".equals(result) ? "" + second : " " + second;
        }
        if (third != 0 && num % third == 0) {
            result += "".equals(result) ? "" + third : " " + third;
        }
        if ("".equals(result)) {
            result = "Таких чисел нет";
        }
        System.out.println(result);
    }

    public static void divWithoutRemainder(int num) {
        String result = "";
        for (String s : String.valueOf(num).split("")) {
            int i = Integer.parseInt(s);
            boolean b = i != 0 && num % i == 0;
            if (b) {
                result += "".equals(result) ? "" + s : " " + s;
            }
        }
        if ("".equals(result)) {
            result = "Таких чисел нет";
        }
        System.out.println(result);
    }
}
