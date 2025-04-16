package ru.job4j.algorithm.a75.string;

public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        int letter = coordinates.charAt(0) - 'a' + 1;
        int digit = coordinates.charAt(1) - '0';
        return (letter + digit) % 2 == 1;
    }
}
