package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int size = 0;
        int count = 0;
        if (right.length > 0) {
            for (int i : left) {
                for (int j : right) {
                    if (i != j) {
                        size++;
                    }
                }
            }
        } else {
            size = left.length;
        }
        int[] rsl = new int[size];
        if (right.length > 0) {
            if (size > 0) {
                for (int i : left) {
                    for (int j : right) {
                        if (i != j) {
                            rsl[count] = i;
                            count++;
                        }
                    }
                }
            }
        } else {
            for (int i : left) {
                rsl[count] = i;
                count++;
            }
        }
        return rsl;
    }
}
