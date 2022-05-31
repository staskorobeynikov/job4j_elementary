package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder builder = new StringBuilder();
        builder.append(fio[0]).append(" ");
        for (int i = 1; i < fio.length; i++) {
            builder.append(fio[i].charAt(0));
            builder.append(".");
        }
        return builder.toString();
    }
}
