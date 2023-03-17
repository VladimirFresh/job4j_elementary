package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (i == 0 && !isLowerLatinLetter(code)) {
                break;
            } else {
                if (!isSpecialSymbol(code) || !isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}