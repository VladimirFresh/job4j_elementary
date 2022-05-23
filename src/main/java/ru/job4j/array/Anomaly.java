package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int[] rsl = new int[2];
        int j = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                rsl[0] = i;
                while (data[i] <= down || data[i] >= up) {
                    if (i < data.length - 1) {
                        rsl[1] = i;
                        i++;
                    } else {
                        rsl[1] = i;
                        break;
                    }
                }
                result[count] = Arrays.copyOf(rsl, 2);
                count++;
            }
        }

        return Arrays.copyOf(result, count);
    }
}
