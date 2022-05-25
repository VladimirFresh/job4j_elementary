package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s = String.valueOf(i);
        int len = s.length();
        int count = 0;
        boolean sym = true;
        while (count < len / 2) {
            if (s.charAt(count) == s.charAt((len - 1) - count)) {
                count++;
                sym = true;
            } else {
                sym = false;
                break;
            }
        }
        return sym;
    }
}