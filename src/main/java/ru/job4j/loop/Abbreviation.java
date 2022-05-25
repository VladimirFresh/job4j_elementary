package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        int len = s.length();
        StringBuilder temp = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (temp.charAt(i) == Character.toUpperCase(temp.charAt(i)) && temp.charAt(i) != ' ') {
                result.append(temp.charAt(i));
            }
        }
        String rsl = result.toString();
        return rsl;
    }
}