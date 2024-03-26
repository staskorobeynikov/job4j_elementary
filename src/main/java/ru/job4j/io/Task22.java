package ru.job4j.io;

public class Task22 {
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        fullName = "* " + fullName + " *";
        phoneNumber = "* " + phoneNumber;
        int limit = fullName.length() - phoneNumber.length();
        for (int i = 0; i < limit - 1; i++) {
            phoneNumber += " ";
        }
        phoneNumber += "*";
        String stars = getStars(fullName.length());
        System.out.println(stars);
        System.out.println(fullName);
        System.out.println(phoneNumber);
        System.out.print(stars);
    }

    private static String getStars(int size) {
        return "*".repeat(Math.max(0, size));
    }
}