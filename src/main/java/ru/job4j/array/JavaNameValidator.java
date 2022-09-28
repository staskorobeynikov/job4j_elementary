package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = name.length() != 0
                            && !Character.isDigit(name.charAt(0))
                            && isNotUpperLatinLetter(name.charAt(0));
        if (rsl) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isNotSpecialSymbol(code) && isNotUpperLatinLetter(code)
                        && isNotLowerLatinLetter(code) && !Character.isDigit(code)) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    private static boolean isNotSpecialSymbol(int code) {
        return code != 36 && code != 95;
    }

    private static boolean isNotUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    private static boolean isNotLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }
}
