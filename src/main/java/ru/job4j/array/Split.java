package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        char[] temp = new char[str.length];
        int count = 0;
        int count2 = 0;
        for (int i = 0; i <= str.length; i++) {
            if (i == str.length) {
                result[count2] = Arrays.copyOf(temp, count);
            } else if (str[i] != c) {
                temp[count++] = str[i];
            } else if (str[i] == c) {
                result[count2] = Arrays.copyOf(temp, count);
                count2++;
                commonCount++;
                count = 0;
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
