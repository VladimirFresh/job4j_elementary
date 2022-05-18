package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int size = right.length + left.length;
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            if (i < left.length) {
                result[i] = left[i];
            } else {
                result[i] = right[i - left.length];
            }
        }
        Arrays.sort(result);
        int size2 = size;
        int count = 1;
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (result[i] == result[j]) {
                        size2--;
                    }
                }
            }
            int[] rsl = new int[size2];
            rsl[0] = result[0];
            for (int i = 1; i < size; i++) {
                if (result[i] != rsl[count - 1]) {
                    rsl[count] = result[i];
                    count++;
                }
            }
            return rsl;
        } else {
            return result;
        }
    }
}
